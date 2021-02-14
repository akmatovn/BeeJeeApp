using System.Collections.Generic;
using App.Portable.Helpers;
using App.Portable.Models;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace App.Portable.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class MenuView : ContentPage
    {
        public ListView ListView => MenuListView;
        public MenuView()
        {
            InitializeComponent();

            BackgroundColor = Color.White;

            if (Settings.IsLoggedIn)
            {
                var masterPageItems = new List<MasterItemModel>
                {
                    new MasterItemModel
                    {
                        Title = "Tasks",
                        Icon = "tasks",
                        TargetType = typeof(MainPage)
                    },
                    new MasterItemModel
                    {
                        Title = "Sign Out",
                        Icon = "exit",
                        TargetType = typeof(LogoutView)
                    }
                };

                MenuListView.ItemsSource = masterPageItems;
                MenuListView.HeightRequest = 5 * 30 + 5;
                BindingContext = this;
            }
            else
            {
                var masterPageItems = new List<MasterItemModel>
                {
                    new MasterItemModel
                    {
                        Title = "Tasks",
                        Icon = "tasks",
                        TargetType = typeof(MainPage)
                    },
                    new MasterItemModel
                    {
                        Title = "Sign",
                        Icon = "login",
                        TargetType = typeof(LoginView)
                    }
                };

                MenuListView.ItemsSource = masterPageItems;
                MenuListView.HeightRequest = 5 * 50 + 5;
                BindingContext = this;
            }
        }
    }
}
