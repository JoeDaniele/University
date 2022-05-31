using System;
using System.Collections.Generic;

namespace ListTests
{
    class Program
    {
        static void Main(string[] args)
        {

            DynamicList();
        }

        static void DynamicList()
        {
            Console.WriteLine("\n\tTesting lists in c# real quick.");

            List<String> Boxers = new List<String>();

            Boxers.Add("\tLennox Lewis");
            Boxers.Add("\tMarvin Hagler");
            Boxers.Add("\tEarnie Shavers");

            Console.WriteLine($"Does the list contain Lennox Lewis?  {Boxers.Contains("Lennox Lewis")}");

            Console.WriteLine($"List cannot be directly printed, must be looped thru like so: ");
            Boxers.ForEach(x => Console.WriteLine(x));

            if (Boxers.Count > 0)
            { Console.WriteLine("The list is greater than 0."); }

            while (Boxers.Count > 0)
            {
                Console.WriteLine($"The list has {Boxers.Count} values total.");
                if (Boxers.Count == 3)
                {
                    break;
                }
            }
        }
    }
}
