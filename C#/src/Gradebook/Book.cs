using System;
using System.Collections.Generic;

namespace Gradebook
{
    class Book
    {
        public void AddGrade(double grade)
        {
            grades.Add(grade);
        }

        List<double> grades;
    }
}