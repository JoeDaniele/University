using System;
using System.Collections.Generic;

namespace Gradebook
{
    class Book
    {
        public Book(string name) //Constructor
        {
            grades = new List<double>();
            this.name = name; //this.  implicit variable refers to the object that is being operated on, "Book", 
        }                     //available in methods/constructors

        public void AddGrade(double grade)
        {
            this.grades.Add(grade); //on THIS object, go to the grades FIELD and add a new grade
        }
        public List<double> grades;
        public string name;
    }
}