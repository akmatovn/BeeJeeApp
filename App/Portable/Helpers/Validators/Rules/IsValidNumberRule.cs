using System.Linq;

namespace App.Portable.Helpers.Validators.Rules
{
    public class IsValidNumberRule<T> : IValidationRule<T>
    {
        public string ValidationMessage { get; set; }

        public bool Check(T value)
        {
            try
            {
                bool isValid = value.ToString().ToCharArray().All(x => char.IsDigit(x));
                return isValid;
            }
            catch
            {
                return false;
            }
        }
    }
}
