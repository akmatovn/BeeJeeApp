using System.Collections.Generic;
using System.Net.Http;
using System.Threading.Tasks;
using Redux.Mvc.States;

namespace App.Portable.Services
{
    public interface ITaskService
    {
        IEnumerable<TaskModel> GetTasks(string type);
        Task<BaseResponse<TaskModel>> AddItemAsync(FormUrlEncodedContent item, string type);
        Task<BaseResponse<TaskModel>> EditItemAsync(FormUrlEncodedContent item, string type);
    }
}
