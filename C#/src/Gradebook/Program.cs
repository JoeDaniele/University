using System; //using system namespace == java.lang.* to remove explicit typing
using System.Collections.Generic;

namespace Gradebook
{
    class Program
    {
        static void Main(string[] args)
        {
            List<double> grades = new List<double>() { 12.7, 10.3, 6.11, 4.1 };
            grades.Add(56.1);


            var result = 0.0;
            foreach (var number in grades)
            {
                result += number;
            }
            result /= grades.Count;

            Console.WriteLine($"Total: {result}");
            System.Console.WriteLine($"Average of scores: {(int)result}");
            System.Console.WriteLine($"Arraylist contains a value of 10.3? {grades.Contains(10.3)}");

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