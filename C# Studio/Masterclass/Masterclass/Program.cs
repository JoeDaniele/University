using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading;

namespace Masterclass
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i < 20; i += 2)
            {
                Console.WriteLine(i);
            }

            Console.WriteLine("\n");




            int counter = 0;
            string userInput = "";
            while (userInput.Equals(""))
            {
                Console.WriteLine("Press enter to increase amt by 1: ");
                userInput = Console.ReadLine();
                counter++;
                Console.WriteLine($"Current count is {counter}");
            }
        }
    }
}
