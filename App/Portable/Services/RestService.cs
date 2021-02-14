using System;
using System.Diagnostics;
using System.Net.Http;
using System.Threading.Tasks;
using App.Portable.Models;
using Newtonsoft.Json;
using Redux.Mvc.States;

namespace App.Portable.Services
{
    public class RestService<T> : IRestService<T>
    {
        private readonly HttpClient _client;

        public RestService()
        {
            _client = new HttpClient();
        }

        public async Task<T> GetDataAsync(string type)
        {
            var item = default(T);

            var uri = new Uri(string.Format(Constants.RestUrl + type, string.Empty));

            try
            {
                var response = await _client.GetAsync(uri);
                if (response.IsSuccessStatusCode)
                {
                    var content = await response.Content.ReadAsStringAsync();
                    item = JsonConvert.DeserializeObject<T>(content);
                }
            }
            catch (HttpRequestException ex)
            {
                Debug.WriteLine(@"				ERROR {0}", ex.Message);
            }
            catch (Exception ex)
            {
                Debug.WriteLine(@"				ERROR {0}", ex.Message);
            }

            return item;
        }

        public T GetData(string type)
        {
            var item = default(T);

            var uri = new Uri(string.Format(Constants.RestUrl + type, string.Empty));

            try
            {
                var response = _client.GetAsync(uri).GetAwaiter().GetResult();
                if (response.IsSuccessStatusCode)
                {
                    var content = response.Content.ReadAsStringAsync().GetAwaiter().GetResult();
                    item = JsonConvert.DeserializeObject<T>(content);
                }
            }
            catch (HttpRequestException ex)
            {
                Debug.WriteLine(@"				ERROR {0}", ex.Message);
            }
            catch (Exception ex)
            {
                Debug.WriteLine(@"				ERROR {0}", ex.Message);
            }

            return item;
        }

        public async Task<T> PostDataAsync(FormUrlEncodedContent request, string type)
        {
            var item = default(T);

            var uri = new Uri(string.Format(Constants.RestUrl + type, string.Empty));

            try
            {
                var response = await _client.PostAsync(uri, request);
                if (response.IsSuccessStatusCode)
                {
                    var result = await response.Content.ReadAsStringAsync();
                    item = JsonConvert.DeserializeObject<T>(result);
                }
            }
            catch (HttpRequestException ex)
            {
                Debug.WriteLine(@"				ERROR {0}", ex.Message);
            }
            catch (Exception ex)
            {
                Debug.WriteLine(@"				ERROR {0}", ex.Message);
            }

            return item;
        }

        public async Task<(BaseResponse<TokenModel>, BaseResponse<UserModel>)> ToLogin(FormUrlEncodedContent request, string type)
        {
            var uri = new Uri(string.Format(Constants.RestUrl + type, string.Empty));
            var token = new BaseResponse<TokenModel>();
            var user = new BaseResponse<UserModel>();
            try
            {
                var response = await _client.PostAsync(uri, request);
                if (response.IsSuccessStatusCode)
                {
                    var result = await response.Content.ReadAsStringAsync();
                    token = JsonConvert.DeserializeObject<BaseResponse<TokenModel>>(result);
                    user = JsonConvert.DeserializeObject<BaseResponse<UserModel>>(result);
                }
            }
            catch (HttpRequestException ex)
            {
                Debug.WriteLine(@"				ERROR {0}", ex.Message);
            }
            catch (Exception ex)
            {
                Debug.WriteLine(@"				ERROR {0}", ex.Message);
            }

            return (token, user);
        }
    }
}
