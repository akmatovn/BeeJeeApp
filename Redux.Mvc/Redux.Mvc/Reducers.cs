using System.Collections.Immutable;
using System.Linq;
using Redux.Mvc.Actions;
using Redux.Mvc.States;

namespace Redux.Mvc
{
    public static class Reducers
    {
        public static ImmutableArray<TaskModel> AddTodoReducer(ImmutableArray<TaskModel> previousState, AddTaskAction action)
        {
            return previousState
                .Insert(0, new TaskModel
                {
                    Id = action.Id,
                    UserName = action.UserName,
                    Email = action.Email,
                    Text = action.Text,
                    Status = action.Status
                });
        }

        public static ImmutableArray<TaskModel> EditTodoReducer(ImmutableArray<TaskModel> previousState, EditTaskAction action)
        {
            var todoToDelete = previousState.First(todo => todo.Id == action.Id);
            var updateTask = new TaskModel
            {
                Id = todoToDelete.Id,
                UserName = action.UserName,
                Email = action.Email,
                Text = action.Text,
                Status = action.Status
            };
            return previousState.Replace(todoToDelete, updateTask);
        }

        public static ImmutableArray<TaskModel> DeleteTodoReducer(ImmutableArray<TaskModel> previousState, DeleteTaskAction action)
        {
            var todoToDelete = previousState.First(todo => todo.Id == action.ItemId);

            return previousState.Remove(todoToDelete);
        }

        public static ImmutableArray<TaskModel> TodosReducer(ImmutableArray<TaskModel> previousState, IAction action)
        {
            switch (action)
            {
                case AddTaskAction todoAction:
                    return AddTodoReducer(previousState, todoAction);
                case EditTaskAction todoAction:
                    return EditTodoReducer(previousState, todoAction);
                case DeleteTaskAction todoAction:
                    return DeleteTodoReducer(previousState, todoAction);
                default:
                    return previousState;
            }
        }

        public static ApplicationState ReduceApplication(ApplicationState previousState, IAction action)
        {
            return new ApplicationState
            {
                TaskList = TodosReducer(previousState.TaskList, action)
            };
        }
    }
}
