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

        public void AddGrade(double grade) //AddGrade is an instance member of class Book
        {
            this.grades.Add(grade); //on THIS object, go to the grades FIELD and add a new grade
        }
        private List<double> grades; //instance field
        private string name; //instance field
    }
}