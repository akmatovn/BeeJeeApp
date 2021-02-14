using System.Net.Http;
using System.Threading.Tasks;
using App.Portable.Models;
using Redux.Mvc.States;

namespace App.Portable.Services
{
    public interface IRestService<T>
    {
        Task<T> GetDataAsync(string type);
        T GetData(string type);
        Task<T> PostDataAsync(FormUrlEncodedContent request, string type);
        Task<(BaseResponse<TokenModel>, BaseResponse<UserModel>)> ToLogin(FormUrlEncodedContent model, string type);
    }
}
