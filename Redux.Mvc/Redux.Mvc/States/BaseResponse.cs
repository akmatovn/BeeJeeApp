using Newtonsoft.Json;

namespace Redux.Mvc.States
{
    public class BaseResponse<T> where T : class
    {
        /// <summary>
        /// 
        /// </summary>
        public string Status { get; set; }
        /// <summary>
        /// 
        /// </summary>
        public T Message { get; set; }
    }

    public class Message<T>
    {
        public T Tasks { get; set; }

        [JsonProperty("total_task_count")]
        public string TotalTaskCount { get; set; }
    }
}
