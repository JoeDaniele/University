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
            //while loop refresher
            /*int counter = 0;
            string userInput = "";
            while (userInput.Equals(""))
            {
                Console.WriteLine("Press enter to increase amt by 1: ");
                userInput = Console.ReadLine();
                counter++;
                Console.WriteLine($"Current count is {counter}");
            }
            */


            Run();
        }
        public static void ForLoop()
        {
            for (int i = -3; i <= 3; i++)
            {
                Console.WriteLine(i);
            }
        }

        public static void WhileLoop()
        {
            int counter = -3;
            while (counter <= 3)
            {
                Console.WriteLine(counter);

                if (counter == 3)
                {
                    break;
                }
                counter++;
            }
        }

        public static void Run()
        {
            WhileLoop();
            Console.WriteLine("\n");
            ForLoop();

        }

    }
}

