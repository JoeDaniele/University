using System;
using System.Collections.Generic;

namespace ListTests
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            DynamicList();
        }

        static void DynamicList()
        {
            Console.WriteLine("\n\nTesting lists in c# real quick.");

            List<String> Boxers = new List<String>();

            Boxers.Add("Lennox Lewis");
            Boxers.Add("Marvin Hagler");
            Boxers.Add("Earnie Shavers");

            Console.WriteLine($"Does the list contain Lennox Lewis?  {Boxers.Contains("Lennox Lewis")}");

            Console.WriteLine($"List cannot be directly printed, must be looped thru like so: ");
            Boxers.ForEach(x => Console.WriteLine(x));


            if (Boxers.Count > 0)
            { Console.WriteLine("The list is greater than 0."); }
        }
    }
}
