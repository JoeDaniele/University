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
            // Check(247);
            NestedCheck(49);


            // Console.WriteLine("Throw in some values to be averaged: ");
            // MyAverage();

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

        public static void Average()
        {
            string input = "0";
            int count = 0;
            int total = 0;
            int currentNumber = 0;

            while (input != "-1")
            {
                Console.WriteLine($"Last number was: {currentNumber}");
                Console.WriteLine("Enter the next score:");
                Console.WriteLine($"Number entries thus far {count}");
                Console.WriteLine("Enter -1 to calculate the average.");

                input = Console.ReadLine();
                if (input == "-1")
                {
                    Console.WriteLine("---------------------------");
                    Console.WriteLine($"The average is: {(double)total / count}");
                }
                if (int.TryParse(input, out currentNumber)
                    && currentNumber > 0 && currentNumber < 101)
                {
                    total += currentNumber;
                }
                else
                {
                    if (!(input.Equals("-1")))
                    {
                        Console.WriteLine("Please enter a value between 1 and 100.");
                    }
                    continue;
                }

                count++;
            }
        }

        public static void MyAverage()
        {

            List<int> numbers = new List<int>();
            int input, sum = 0;

            while (int.TryParse(Console.ReadLine(), out input))
            {
                sum = sum + input;
                numbers.Add(input);
            }

            Console.WriteLine("Average: " + (numbers.Average()));

        }

        public static void Check(int number)
        {
            if (number % 2 == 0)
            {
                Console.WriteLine($"{number} is even");
            }
            else
            {
                Console.WriteLine($"{number} is odd");
            }



        }

        public static void NestedCheck(int number)
        {
            if (number % 3 == 0)
            {
                Console.WriteLine($"{number} Divisible by 3");
            }
            if (number % 7 == 0)
            {
                Console.WriteLine($"{number} Divisible by 7");

            }
        }
    }
}


/*
 *
 *
 *
 *
 * 
 */