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
            book.AddGrade(77.5); //B = class name : b = variable name


            var stats = book.GetStats();
            Console.WriteLine($"Total: {stats:N3}"); //Formatting specifiers to limit decimals
            Console.WriteLine($"Average of scores: {(int)stats.Average}");
            Console.WriteLine($"The lowest grade is: {stats.Low}");
            Console.WriteLine($"The highest grade is: {stats.High}");
            //Console.WriteLine($"Arraylist contains a value of 10.3? {stats.Contains(10.3)}");
        }
    }
}