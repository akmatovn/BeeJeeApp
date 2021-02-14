using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Net.Http;
using App.Portable.Helpers;
using App.Portable.Helpers.Validators;
using App.Portable.Helpers.Validators.Rules;
using Redux.Mvc.Actions;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace App.Portable.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class AddItemView : ContentPage, INotifyPropertyChanged
    {
        public ValidatableObject<string> UserName { get; set; } = new ValidatableObject<string>();
        public ValidatableObject<string> Text { get; set; } = new ValidatableObject<string>();
        public ValidatablePair<string> Email { get; set; } = new ValidatablePair<string>();

        public AddItemView()
        {
            AddValidationRules();
            InitializeComponent();

            BindingContext = this;
        }

        private async void AddInputTextBox_Completed(object sender, EventArgs e)
        {
            if (!App.IsConnected())
            {
                await DisplayAlert("No connection", "Please, check your internet connection and try again", "OK");
                return;
            }

            if (!AreFieldsValid()) return;

            var formContent = new FormUrlEncodedContent(new[]
            {
                    new KeyValuePair<string, string>("username", UserNameTextBlock.Text),
                    new KeyValuePair<string, string>("email", EmailInputTextBox.Text),
                    new KeyValuePair<string, string>("text", TextInputTextBlock.Text)
                });

            var item = await App.TaskService.AddItemAsync(formContent, CommandUrl.Create);

            if (item.Status == Events.StatusError)
            {
                await DisplayAlert($"{item.Status}", $"{nameof(item.Message.Email)}: {item.Message.Email}", "Ok");
                return;
            }

            App.Store.Dispatch(new AddTaskAction
            {
                Id = item.Message.Id,
                UserName = item.Message.UserName,
                Text = item.Message.Text,
                Email = item.Message.Email,
                Status = 0
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
        }

        bool AreFieldsValid()
        {
            var isUserNameValid = UserName.Validate();
            var isTextValid = Text.Validate();
            var isEmailValid = Text.Validate();

            return isUserNameValid && isTextValid && isEmailValid;
        }
    }
}
