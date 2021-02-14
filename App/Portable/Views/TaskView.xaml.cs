using System;
using System.Collections.Immutable;
using System.Collections.ObjectModel;
using System.Diagnostics;
using Xamarin.Forms;
using Redux.Mvc.States;
using Xamarin.Forms.Xaml;

namespace App.Portable.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class TaskView : ContentView
    {
        private ObservableCollection<object> _selectedItems;

        public Command GoToEditItemCommand { get; }

        #region Pagination

        private ImmutableArray<TaskModel> _allTasks;
        private ObservableCollection<TaskModel> _tasks;
        private int _pageSize = 3;

        private int _previousPageNumber;
        private int _currentPageNumber = 1;
        private int _nextPageNumber;
        private int _totalPages;
        private int _currentItemsCount;

        private bool _nextButtonEnabled;
        private bool _previousButtonEnabled;

        public Command FirstButtonCommand { get; set; }
        public Command PreviousButtonCommand { get; set; }
        public Command NextButtonCommand { get; set; }
        public Command LastButtonCommand { get; set; }

        #endregion

        public TaskView()
        {
            InitializeComponent();

            LoadItems();

            GoToEditItemCommand = new Command(EditItem, CanExecuteGoToEditItemCommand);

            FirstButtonCommand = new Command(FirstButtonCommandExecute);
            PreviousButtonCommand = new Command(PreviousButtonCommandExecute);
            NextButtonCommand = new Command(NextButtonCommandExecute);
            LastButtonCommand = new Command(LastButtonCommandExecute);

            BindingContext = this;
        }

        private void LoadItems()
        {
            App.Store.Subscribe((ApplicationState state) =>
            {
                _allTasks = state.TaskList;
                UpdatePaging();
                CurrentItemsCount = _currentPageNumber * _tasks.Count;
            });
        }

        private async void AddItem(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new AddItemView());
        }

        private async void EditItem(object arg)
        {
            var task = (TaskModel)_selectedItems[0];

            await Navigation.PushAsync(new EditItemView(task));
        }

        private bool CanExecuteGoToEditItemCommand(object arg)
        {
            var canExecute = this._selectedItems != null && _selectedItems.Count == 1;
            return canExecute;
        }

        private bool CanExecuteDeleteItemsCommand(object arg)
        {
            var canExecute = _selectedItems != null && _selectedItems.Count > 0;
            return canExecute;
        }

        public ObservableCollection<object> SelectedItems
        {
            get => _selectedItems;
            set
            {
                if (_selectedItems != value)
                {
                    ObservableCollection<object> oldValue = _selectedItems;
                    _selectedItems = value;
                    OnSelectedItems(oldValue);
                    OnPropertyChanged();
                }
            }
        }

        private void OnSelectedItems(ObservableCollection<object> oldValue)
        {
            if (oldValue != null) oldValue.CollectionChanged -= SelectedItems_CollectionChanged;

            if (_selectedItems != null) _selectedItems.CollectionChanged += SelectedItems_CollectionChanged;

            UpdateCanExecuteGoToEditItemCommand();
        }

        private void SelectedItems_CollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            UpdateCanExecuteGoToEditItemCommand();
        }

        private void UpdateCanExecuteGoToEditItemCommand()
        {
            GoToEditItemCommand.ChangeCanExecute();
        }

        #region PaginationProperties

        public int ItemsCount => _allTasks.Length;

        public int CurrentItemsCount
        {
            get => this._currentItemsCount;
            set
            {
                if (this._currentItemsCount != value)
                {
                    this._currentItemsCount = value;
                    this.OnPropertyChanged("CurrentItemsCount");
                }
            }
        }

        public ObservableCollection<TaskModel> Tasks
        {
            get => _tasks ?? (_tasks = new ObservableCollection<TaskModel>());
            set { _tasks = value; OnPropertyChanged(); }
        }

        public int PageSize
        {
            get { return _pageSize; }
            set { _pageSize = value; OnPropertyChanged(); }
        }

        public int PreviousPageNumber
        {
            get => _previousPageNumber;
            private set { _previousPageNumber = value; OnPropertyChanged(); }
        }

        public int CurrentPageNumber
        {
            get => _currentPageNumber;
            set
            {
                if (_currentPageNumber == value || value == 0)
                    return;

                _currentPageNumber = value;
                this.CurrentItemsCount = _currentPageNumber * this._tasks.Count;
                // Triggers update of everything
                UpdatePaging();

                OnPropertyChanged();
            }
        }

        public int NextPageNumber
        {
            get { return _nextPageNumber; }
            private set { _nextPageNumber = value; OnPropertyChanged(); }
        }

        public int TotalPages
        {
            get { return _totalPages; }
            private set { _totalPages = value; OnPropertyChanged(); }
        }

        // Enabling Buttons

        public bool NextButtonEnabled
        {
            get { return _nextButtonEnabled; }
            set { _nextButtonEnabled = value; OnPropertyChanged(); }
        }

        public bool PreviousButtonEnabled
        {
            get { return _previousButtonEnabled; }
            set { _previousButtonEnabled = value; OnPropertyChanged(); }
        }
        #endregion

        #region PaginationMethods

        private void UpdatePaging()
        {
            TotalPages = (int)Math.Ceiling(_allTasks.Length / (double)PageSize);

            var lastIndexToGet = PageSize * CurrentPageNumber;
            var firstIndexToGet = lastIndexToGet - PageSize;

            Tasks.Clear();

            for (int i = firstIndexToGet; i < lastIndexToGet; i++)
            {
                try
                {
                    Tasks.Add(_allTasks[i]);
                }
                catch (Exception)
                {
                    Debug.WriteLine($"Couldn't get Task at index: {i}");
                }
            }

            PreviousPageNumber = _currentPageNumber == 0 ? 0 : _currentPageNumber - 1;
            NextPageNumber = _currentPageNumber == TotalPages ? TotalPages : _currentPageNumber + 1;

            PreviousButtonEnabled = CurrentPageNumber != 1;
            NextButtonEnabled = CurrentPageNumber != TotalPages;

            TaskItemsControl.ItemsSource = Tasks.ToImmutableArray();
        }

        public void FirstButtonCommandExecute(object parameter)
        {
            CurrentPageNumber = 1;
        }

        public void PreviousButtonCommandExecute(object parameter)
        {
            CurrentPageNumber = PreviousPageNumber;
        }

        public void NextButtonCommandExecute(object parameter)
        {
            CurrentPageNumber = NextPageNumber;
        }

        public void LastButtonCommandExecute(object parameter)
        {
            CurrentPageNumber = TotalPages;
        }

        #endregion
    }
}
