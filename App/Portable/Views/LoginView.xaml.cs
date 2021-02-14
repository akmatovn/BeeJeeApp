using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Threading.Tasks;
using App.Portable.Helpers;
using App.Portable.Helpers.Validators;
using App.Portable.Helpers.Validators.Rules;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace App.Portable.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class LoginView : ContentPage
    {
        public ValidatableObject<string> UserName { get; set; } = new ValidatableObject<string>();
        public ValidatablePair<string> Password { get; set; } = new ValidatablePair<string>();

        public LoginView()
        {
            AddValidationRules();
            InitializeComponent();

            BindingContext = this;
        }

        private async void LoginClick(object sender, EventArgs e)
        {
            if (!AreFieldsValid()) return;

            await SendLoginRequest();
        }

        private async void Cancel_Completed(object sender, EventArgs e)
        {
            await Navigation.PopToRootAsync();
        }

        private async Task SendLoginRequest()
        {
            if (App.IsConnected())
            {
                var formContent = new FormUrlEncodedContent(new[]
                {
                    new KeyValuePair<string, string>("username", UserNameTextBlock.Text),
                    new KeyValuePair<string, string>("password", PasswordTextBlock.Text)
                });

                var item = await App.UseService.Login(formContent, CommandUrl.Login);

                if (item.Item2.Status == Events.StatusError)
                {
                    await DisplayAlert($"{item.Item2.Status}", $"{item.Item2.Message.Password}", "Ok");
                    return;
                }

                if (item.Item2.Status == Events.StatusOk)
                {
                    Settings.IsLoggedIn = true;
                    await DisplayAlert($"{item.Item1.Status}", "Success!", "Ok");
                    App.MasterDetailPage.CreateMenu();
                }
            }
            else
            {
                await DisplayAlert("No connection", "Please, check your internet connection and try again", "Quit");
            }
        }

        public void AddValidationRules()
        {
            UserName.Validations.Add(new IsNotNullOrEmptyRule<string> { ValidationMessage = "User Name Required" });

            //Password Validation Rules
            Password.Item1.Validations.Add(new IsNotNullOrEmptyRule<string> { ValidationMessage = "Password Required" });
        }

        bool AreFieldsValid()
        {
            bool isFirstNameValid = UserName.Validate();
            bool isPasswordValid = Password.Validate();

            return isFirstNameValid && isPasswordValid;
        }
    }
}
