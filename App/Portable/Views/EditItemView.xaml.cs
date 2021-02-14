using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Net.Http;
using App.Portable.Helpers;
using App.Portable.Helpers.Validators;
using App.Portable.Helpers.Validators.Rules;
using Redux.Mvc.Actions;
using Xamarin.Forms;
using Redux.Mvc.States;
using Xamarin.Forms.Xaml;

namespace App.Portable.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class EditItemView : ContentPage, INotifyPropertyChanged
    {
        public int TaskId { get; set; }
        public ValidatableObject<string> UserName { get; set; } = new ValidatableObject<string>();
        public ValidatableObject<string> Text { get; set; } = new ValidatableObject<string>();
        public ValidatablePair<string> Email { get; set; } = new ValidatablePair<string>();
        public ValidatablePair<string> Status { get; set; } = new ValidatablePair<string>();

        public EditItemView(TaskModel item)
        {
            TaskId = item.Id;
            UserName.Value = item.UserName;
            Text.Value = item.Text;
            Email.Item1.Value = item.Email;
            Status.Item1.Value = item.Status.ToString();

            AddValidationRules();

            InitializeComponent();

            BindingContext = this;
        }

        private async void EditInputTextBox_Completed(object sender, EventArgs e)
        {
            if (!App.IsConnected())
            {
                await DisplayAlert("No connection", "Please, check your internet connection and try again", "OK");
                return;
            }

            if (!Settings.IsLoggedIn)
            {
                var res = await DisplayAlert("You are not authorized!", "Want to login?", "Ok", "Cancel");
                if (res) await Navigation.PushAsync(new LoginView());
                return;
            }

            if (!AreFieldsValid()) return;

            var formContent = new FormUrlEncodedContent(new[]
                {
                    new KeyValuePair<string, string>("text", TextInputTextBlock.Text),
                    new KeyValuePair<string, string>("status", StatusInputTextBlock.Text),
                    new KeyValuePair<string, string>("token", Settings.Token)
                });

            var id = Convert.ToInt32(IdTextBlock.Text);
            var type = string.Format(CommandUrl.Edit, id);

            var item = await App.TaskService.EditItemAsync(formContent, type);

            if (item.Status == Events.StatusError)
            {
                await DisplayAlert($"{item.Status}", $"{nameof(item.Message.Email)}: {item.Message.Email}", "Ok");
                return;
            }

            App.Store.Dispatch(new EditTaskAction
            {
                Id = id,
                UserName = UserNameTextBlock.Text,
                Text = TextInputTextBlock.Text,
                Email = EmailInputTextBox.Text,
                Status = Convert.ToInt32(StatusInputTextBlock.Text)
            });

            await DisplayAlert($"{item.Status}", "Success!", "Ok");
            await Navigation.PopAsync();

        }

        private async void Cancel_Completed(object sender, EventArgs e)
        {
            await Navigation.PopToRootAsync();
        }

        public void AddValidationRules()
        {
            UserName.Validations.Add(new IsNotNullOrEmptyRule<string> { ValidationMessage = "User Name Required" });
            Text.Validations.Add(new IsNotNullOrEmptyRule<string> { ValidationMessage = "Text Required" });

            //Email Validation Rules
            Email.Item1.Validations.Add(new IsNotNullOrEmptyRule<string> { ValidationMessage = "Email Required" });
            Email.Item1.Validations.Add(new IsValidEmailRule<string> { ValidationMessage = "Invalid Email" });

            //Status Validation Rules
            Status.Item1.Validations.Add(new IsNotNullOrEmptyRule<string> { ValidationMessage = "Status Required" });
            Status.Item1.Validations.Add(new IsValidNumberRule<string> { ValidationMessage = "Invalid Status" });
        }

        bool AreFieldsValid()
        {
            var isUserNameValid = UserName.Validate();
            var isTextValid = Text.Validate();
            var isEmailValid = Text.Validate();
            var isStatusValid = Status.Validate();

            return isUserNameValid && isTextValid && isEmailValid && isStatusValid;
        }
    }
}
