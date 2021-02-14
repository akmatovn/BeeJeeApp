using System.Collections.Immutable;
using Newtonsoft.Json;

namespace Redux.Mvc.States
{
    public class TaskModel
    {
        public int Id { get; set; }
        public string UserName { get; set; }
        public string Email { get; set; }
        public string Text { get; set; }
        public int Status { get; set; }
        [JsonProperty("image_path")]
        public string ImagePath { get; set; }
    }

    //public class Message
    //{
    //    public ImmutableArray<TaskModel> Tasks { get; set; }
    //    [JsonProperty("total_task_count")]
    //    public string TotalTaskCount { get; set; }
    //}

    //public class TaskResponse
    //{
    //    public string Status { get; set; }
    //    public Message Message { get; set; }
    //}
}
