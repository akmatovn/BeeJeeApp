using Xamarin.Forms;

namespace App.Portable.Views
{
    public static class ThemesBehavior
    {
        public static readonly BindableProperty StyleClassProperty =
            BindableProperty.CreateAttached("StyleClass", typeof(string), typeof(ThemesBehavior), string.Empty, propertyChanged: null);

        public static string GetStyleClass(BindableObject view)
        {
            return (string)view.GetValue(StyleClassProperty);
        }

        public static void SetStyleClass(BindableObject view, string value)
        {
            view.SetValue(StyleClassProperty, value);
        }
    }
}
