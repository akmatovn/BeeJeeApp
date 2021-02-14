using System.Net.Http;
using System.Threading.Tasks;
using App.Portable.Models;
using Redux.Mvc.States;

namespace App.Portable.Services
{
    public interface IUserService
    {
        Task<(BaseResponse<TokenModel>, BaseResponse<UserModel>)> Login(FormUrlEncodedContent request, string type);
    }
}
