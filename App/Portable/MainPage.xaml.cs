using System.Threading;
using App.Portable.Views;
using Xamarin.Forms;

namespace App.Portable
{
    public partial class MainPage : ContentPage
    {
        private TaskView _taskView;
        public MainPage()
        {
            _taskView = new TaskView();

            LoadItems();

            InitializeComponent();
        }

        private async void LoadItems()
        {
            if (!App.IsConnected())
            {
                await DisplayAlert("No connection", "Please, check your internet connection and try again", "Quit");
                Thread.CurrentThread.Abort();
            }
        }
    }
}
