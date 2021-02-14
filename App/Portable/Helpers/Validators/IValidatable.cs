﻿using System.Collections.Generic;
using System.ComponentModel;

namespace App.Portable.Helpers.Validators
{
    public interface IValidatable<T> : INotifyPropertyChanged
    {
        List<IValidationRule<T>> Validations { get; }

        List<string> Errors { get; set; }

        bool Validate();

        bool IsValid { get; set; }
    }
}
