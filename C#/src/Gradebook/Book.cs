using System;
using System.Collections.Generic;

namespace Gradebook
{
    public class Book
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

        public Stats GetStats() //This method returns a type of object Stats
        {
            var result = new Stats();
            result.Average = 0.0;
            var lowGrade = double.MaxValue;
            var highGrade = double.MinValue;

            foreach (var grade in grades)
            {
                result.Low = Math.Min(grade, result.Low);
                result.High = Math.Max(grade, result.High);
                result.Average += grade;
            }
            result.Average /= grades.Count; //COUNT is a PROPERTY not a method. Methods require parameters

            return result;

        }
    }
}