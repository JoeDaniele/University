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

        public void ShowStats()
        {
            var result = 0.0;
            var lowGrade = double.MaxValue;
            var highGrade = double.MinValue;

            foreach (var number in grades)
            {
                lowGrade = Math.Min(number, highGrade);
                highGrade = Math.Max(number, highGrade);
                result += number;
            }
            result /= grades.Count; //COUNT is a PROPERTY not a method. Methods require parameters

            Console.WriteLine($"Total: {result:N3}"); //Formatting specifiers to limit decimals
            Console.WriteLine($"Average of scores: {(int)result}");
            Console.WriteLine($"The lowest grade is: {lowGrade}");
            Console.WriteLine($"The highest grade is: {highGrade}");
            Console.WriteLine($"Arraylist contains a value of 10.3? {grades.Contains(10.3)}");
        }

        private List<double> grades; //instance field
        private string name; //instance field
    }
}