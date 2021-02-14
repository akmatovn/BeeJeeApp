namespace Redux.Mvc.Actions
{
    public class BaseTaskAction : IAction
    {
        public int Id { get; set; }
        public string UserName { get; set; }
        public string Email { get; set; }
        public string Text { get; set; }
        public int Status { get; set; }
    }

    public class AddTaskAction : BaseTaskAction
    {
    }

    public class EditTaskAction : BaseTaskAction
    {
    }
    
    public class DeleteTaskAction : IAction
    {
        public int ItemId { get; set; }
    }

    public class ClearCompletedTaskAction : IAction
    {

    }
}
