using System;
using App.Portable.Helpers;
using App.Portable.Helpers.Validators;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace App.Portable.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class LogoutView : ContentPage
    {
        public ValidatableObject<string> UserName { get; set; } = new ValidatableObject<string>();
        public ValidatablePair<string> Password { get; set; } = new ValidatablePair<string>();

        public LogoutView()
        {
            //InitializeComponent();

            CreateModelView();
        }

        private void LogoutClick(object sender, EventArgs e)
        {
            Settings.IsLoggedIn = false;
            Settings.Token = string.Empty;
            App.MasterDetailPage.CreateMenu();
        }

        private async void Cancel_Completed(object sender, EventArgs e)
        {
            await Navigation.PopToRootAsync();
        }

        private async void CreateModelView()
        {
            var res = await DisplayAlert("Sign Out", "Are you sure you want to sign out?", "Ok", "Cancel");
            if (res)
            {
                Settings.IsLoggedIn = false;
                Settings.Token = string.Empty;
                App.MasterDetailPage.CreateMenu();
            }
            else
            {
                await Navigation.PopToRootAsync();
            }
        }
    }
}
