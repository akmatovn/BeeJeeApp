using System.Collections.Immutable;

namespace Redux.Mvc.States
{
    public class ApplicationState
    {
        public ImmutableArray<TaskModel> TaskList { get; set; }
    }
}
