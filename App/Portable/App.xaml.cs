using System.Collections.Immutable;
using App.Portable.CustomControls;
using App.Portable.Helpers;
using App.Portable.Services;
using Plugin.Connectivity;
using Redux;
using Redux.Mvc;
using Redux.Mvc.States;
using Xamarin.Forms;

namespace App.Portable
{
    public partial class App : Application
    {
        public static IStore<ApplicationState> Store { get; set; }

        private static ITaskService _taskService;
        private static IUserService _userService;
        private static IRestService<BaseResponse<Message<ImmutableArray<TaskModel>>>> _restService;

        public static MyMasterDetailPage MasterDetailPage;

        public App()
        {
            InitializeComponent();

            var initialState = new ApplicationState
            {
                TaskList = IsConnected()
                    ? RestService.GetData(CommandUrl.GetTasks).Message.Tasks
                    : ImmutableArray<TaskModel>.Empty
            };

            Store = new Store<ApplicationState>(Reducers.ReduceApplication, initialState);

            MasterDetailPage = new MyMasterDetailPage();
            MainPage = MasterDetailPage;
        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }

        public static bool IsConnected()
        {
            using (var connectivity = CrossConnectivity.Current)
            {
                return connectivity.IsConnected;
            }
        }

        public static IRestService<BaseResponse<Message<ImmutableArray<TaskModel>>>> RestService => _restService ??
                                                    (_restService = new RestService<BaseResponse<Message<ImmutableArray<TaskModel>>>>());

        public static ITaskService TaskService => _taskService ?? (_taskService = new TaskService());

        public static IUserService UseService => _userService ?? (_userService = new UserService());
    }
}
