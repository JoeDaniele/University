using System; //using system namespace == java.lang.* to remove explicit typing
using System.Collections.Generic;

namespace Gradebook
{
    class Program
    {
        static void Main(string[] args)
        {

            var numbers = new[] { 12.7, 10.1, 6.11, 4.1 }; //array of double
            List<double> grades = new List<double>() { 12.7, 10.3, 6.11, 4.1 };
            grades.Add(56.1);


            var result = 0.0;
            foreach (var number in grades)
            {
                result += number;
            }
            Console.WriteLine("Total: " + result);
            System.Console.WriteLine("Average of scores: " + result / grades.Count);


            if (args.Length > 0)
            {
                Console.WriteLine($"Hello {args[0]} {args[1]}!"); // string interpolation $
            }
            else
            {
                Console.WriteLine("Else.");
            }
        }
    }
}