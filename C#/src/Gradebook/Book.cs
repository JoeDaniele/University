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

        internal void ShowStats()
        {
            List<double> grades = new List<double>() { 12.7, 10.3, 6.11, 4.1 };
            grades.Add(56.1);

            var result = 0.0;
            var highGrade = double.MinValue;
            var lowGrade = double.MaxValue;
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
            Console.WriteLine($"The lowest grade is: {highGrade}");
            Console.WriteLine($"Arraylist contains a value of 10.3? {grades.Contains(10.3)}");
        }

        private List<double> grades; //instance field
        private string name; //instance field
    }
}