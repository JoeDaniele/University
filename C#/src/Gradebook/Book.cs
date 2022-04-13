using System;
using System.Collections.Generic;

namespace Gradebook
{
    class Book
    {
        public Book() //Constructor
        {
            grades = new List<double>();
            this.name = name;
        }
        public void AddGrade(double grade)
        {
            grades.Add(grade);
        }
        private List<double> grades;
        private string name;
    }
}