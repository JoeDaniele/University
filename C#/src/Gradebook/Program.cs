using System; //System namespace == java.lang.* to remove explicit typing
using System.Collections.Generic;

namespace Gradebook
{
    class Program
    {
        static void Main(string[] args)
        {
            var book = new Book("Master Book");
            book.AddGrade(89.1);
            book.AddGrade(90.5);
            book.grades.Add(101);

            List<double> grades = new List<double>() { 12.7, 10.3, 6.11, 4.1 };
            grades.Add(56.1);

            var result = 0.0;
            foreach (var number in grades)
            {
                result += number;
            }
            result /= grades.Count; //COUNT is a PROPERTY not a method. Methods require parameters

            Console.WriteLine($"Total: {result:N3}"); //Formatting specifiers to limit decimals
            Console.WriteLine($"Average of scores: {(int)result}");
            Console.WriteLine($"Arraylist contains a value of 10.3? {grades.Contains(10.3)}");
        }

    }
}