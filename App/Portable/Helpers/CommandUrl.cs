namespace App.Portable.Helpers
{
    public static class CommandUrl
    {
        public static string GetTasks = "?developer=testUser";
        public static string Create = "create?developer=testUser";
        public static string Edit = "edit/{0}?developer=testUser";
        public static string Login = "login?developer=testUser";
    }
}
