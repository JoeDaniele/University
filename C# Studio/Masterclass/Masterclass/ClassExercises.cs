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
            //NestedCheck(9);



            //created object of class
            //instance of Human
            Human Claudius = new Human();
            Human Domino = new Human();
            Claudius.firstName = "Claudius";
            Claudius.lastName = "Lewis";

            //calling method in human class
            Claudius.Introduction();

            //  Euler001();



            // Console.WriteLine("Throw in some values to be averaged: ");
            // MyAverage();

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
        public static void FizzBuzz(int number)
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
        public static void Euler001()
        {
            Console.WriteLine("Find the sum of all the multiples of 3 or 5 below 1000.");

            int multiples = 0;
            for (int i = 0; i < 1000; i++)
            {
                if (i % 3 == 0 || i % 5 == 0)
                {
                    multiples++;
                }
            }
            Console.WriteLine(multiples);
            //be sure to not print within the loop like a novice 

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