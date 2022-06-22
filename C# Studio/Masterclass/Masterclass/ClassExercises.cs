using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading;

namespace Masterclass
{
    internal class CourseExercises
    {
        static void Main(string[] args)
        {



            RunBreakContSolutionTwo();


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
                counter++;
                if (counter == 4)
                {
                    break;
                }

            }

            int countTwo = 0;
            string userInput = "";
            while (userInput.Equals(""))
            {
                Console.WriteLine("Press enter to increase amt by 1: ");
                userInput = Console.ReadLine();
                countTwo++;
                Console.WriteLine($"Current count is {countTwo}");
            }
        }
        public static void RunForWhile()
        {
            WhileLoop();
            Console.WriteLine("\n");
            ForLoop();

        }
        public static void RunBreakCont()
        {

            for (int i = -10; i <= 10; i++)

                while (i % 3 == 0)
                {
                    Console.WriteLine("Skip");
                    // TODO

                    Console.WriteLine(i++);
                }
        }
        public static void RunBreakContSolutionTwo()
        {
            int i = -10;

            while (true)
            {
                if (i % 3 == 0)
                {
                    i++;
                    continue;
                }
                if (i == 10)
                    break;
                Console.WriteLine(i++);

            }
        }
    }
}


