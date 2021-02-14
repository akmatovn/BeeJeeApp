using System.Collections.Generic;
using System.Collections.Immutable;
using System.Net.Http;
using System.Threading.Tasks;
using Redux.Mvc.States;

namespace App.Portable.Services
{
    public class TaskService : ITaskService
    {
        private readonly IRestService<BaseResponse<Message<ImmutableArray<TaskModel>>>> _restService;
        private readonly IRestService<BaseResponse<TaskModel>> _restPostService;
        private readonly IList<TaskModel> _items;

        public TaskService()
        {
            _restService = new RestService<BaseResponse<Message<ImmutableArray<TaskModel>>>>();
            _restPostService = new RestService<BaseResponse<TaskModel>>();
            _items = new List<TaskModel>();
        }

        public IEnumerable<TaskModel> GetTasks(string type)
        {
            var res = _restService.GetData(type);
            var item = res.Message.Tasks;
            return item;
        }

        public async Task<BaseResponse<TaskModel>> AddItemAsync(FormUrlEncodedContent item, string type)
        {
            var res = await _restPostService.PostDataAsync(item, type);
            return res;
        }

        public async Task<BaseResponse<TaskModel>> EditItemAsync(FormUrlEncodedContent item, string type)
        {
            var res = await _restPostService.PostDataAsync(item, type);
            return res;
        }
    }
}
