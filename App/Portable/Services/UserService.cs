using System.Diagnostics;
using System.Net.Http;
using System.Threading.Tasks;
using App.Portable.Helpers;
using App.Portable.Models;
using Redux.Mvc.States;
using Xamarin.Forms;

namespace App.Portable.Services
{
    public class UserService : IUserService
    {
        private readonly IRestService<(BaseResponse<TokenModel>, BaseResponse<UserModel>)> _restService;
        public UserService()
        {
            _restService = new RestService<(BaseResponse<TokenModel>, BaseResponse<UserModel>)>();
        }
        public async Task<(BaseResponse<TokenModel>, BaseResponse<UserModel>)> Login(FormUrlEncodedContent request, string type)
        {
            var item = await _restService.ToLogin(request, type);

            if (item.Item1.Status == Events.StatusOk)
            {
                if (Application.Current.Properties.ContainsKey("Token"))
                {
                    Settings.Token = item.Item1.Message.Token;
                }
                else
                {
                    Application.Current.Properties.Add("Token", item.Item1.Message.Token);
                    Settings.Token = item.Item1.Message.Token;
                }

                Debug.WriteLine(@"				Item successfully posted.");

                Settings.IsLoggedIn = true;
            }

            return item;
        }
    }
}
