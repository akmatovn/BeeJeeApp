using System;
using System.Collections.Generic;
using App.Portable.Helpers;
using App.Portable.Models;
using App.Portable.Views;
using Xamarin.Forms;

namespace App.Portable.CustomControls
{
    public class MyMasterDetailPage : MasterDetailPage
    {
        MenuView _masterView;

        public MyMasterDetailPage()
        {
            CreateMenu();
        }

        public void CreateMenu()
        {
            _masterView = new MenuView();

            Master = _masterView;
            Detail = new NavigationPage(new MainPage())
            {
                BarTextColor = Color.White
            };
            MasterBehavior = MasterBehavior.Split;
            _masterView.ListView.ItemSelected += OnItemSelected;
        }

        private async void OnItemSelected(object sender, SelectedItemChangedEventArgs e)
        {
            if (e.SelectedItem == null)
            {
                return; //ItemSelected is called on deselection, which results in SelectedItem being set to null
            }
            
            var item = e.SelectedItem as MasterItemModel;
            if (item != null && item.TargetType == null)
            {
                if (Settings.IsLoggedIn)
                {
                    await Detail.Navigation.PushModalAsync(new NavigationPage(new LoginView()));
                }
                else
                {
                    var res = await DisplayAlert("You are not authorized!", "Want to login?", "Ok", "Cancel");
                    if (res)
                    {
                        await Detail.Navigation.PushModalAsync(new NavigationPage(new LoginView()));
                    }
                }
            }
            else if (item?.TargetType != null)
            {
                if (item.TargetType == typeof(MainPage))
                {
                    await Detail.Navigation.PopToRootAsync();
                }
                else
                {
                    var pages = Detail.Navigation.NavigationStack;
                    List<Page> data = new List<Page>();
                    foreach (var p in pages)
                    {
                        if (p.GetType() == item.TargetType)
                        {
                            data.Add(p);
                        }
                    }
                    if (data.Count > 0)
                    {
                        foreach (var p in data) { Detail.Navigation.RemovePage(p); }
                    }
                    await Detail.Navigation.PushAsync((Page)Activator.CreateInstance(item.TargetType));
                }
                _masterView.ListView.SelectedItem = null;
                IsPresented = false;
            }

            // disable the visual selection state.
            ((ListView)sender).SelectedItem = null;
        }
    }
}
