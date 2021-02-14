using System;
using System.Collections.Generic;
using System.Text;
using Plugin.Settings;
using Plugin.Settings.Abstractions;

namespace App.Portable.Helpers
{
	public static class Settings
	{
		private static ISettings AppSettings
		{
			get
			{
				return CrossSettings.Current;
			}
		}

		#region Setting Constants

		private static readonly string stringDefault = string.Empty;
		private static readonly int intDefault = 0;
		public static readonly bool booleanDefault = false;

		private const string IsLoggedInKey = "IsLoggedIn";
		private const string HolderKey = "Holder";
		private const string AppleUniqueIdKey = "AppleUniqueId";
		private const string TokenKey = "Token";
		private const string LastOrderGuidKey = "LastOrderGuid";
		private const string RefreshTokenKey = "RefreshToken";

		#endregion

		public static bool IsLoggedIn
		{
			get { return AppSettings.GetValueOrDefault(IsLoggedInKey, booleanDefault); }
			set { AppSettings.AddOrUpdateValue(IsLoggedInKey, value); }
		}

		public static string Holder
		{
			get { return AppSettings.GetValueOrDefault(HolderKey, stringDefault); }
			set { AppSettings.AddOrUpdateValue(HolderKey, value); }
		}

		public static string AppleUniqueId
		{
			get { return AppSettings.GetValueOrDefault(AppleUniqueIdKey, stringDefault); }
			set { AppSettings.AddOrUpdateValue(AppleUniqueIdKey, value); }
		}

		public static string Token
		{
			get { return AppSettings.GetValueOrDefault(TokenKey, stringDefault); }
			set { AppSettings.AddOrUpdateValue(TokenKey, value); }
		}

		public static string RefreshToken
		{
			get { return AppSettings.GetValueOrDefault(RefreshTokenKey, stringDefault); }
			set { AppSettings.AddOrUpdateValue(RefreshTokenKey, value); }
		}

		public static string LastOrderGuid
		{
			get { return AppSettings.GetValueOrDefault(LastOrderGuidKey, stringDefault); }
			set { AppSettings.AddOrUpdateValue(LastOrderGuidKey, value); }
		}
	}
}
