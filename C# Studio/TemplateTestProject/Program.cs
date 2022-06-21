using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading;

namespace TemplateTestProject
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int[] numbers = new int[5];

            for (int i = 0; i < numbers.Length; i++)
            {
                Console.WriteLine(i + 1);
            }


            int[] arrayTwo = { 0, 1, 2, 3 };
            Console.WriteLine("\n");

            for (int i = 0; i < arrayTwo.Length; i++)
            {
                Console.WriteLine(arrayTwo[i]);
            }

            Console.WriteLine($"Printing element in arrayTwo at index 3:   {arrayTwo[3]}");

            int[] array = { 3, 5, -4, 8, 11, 1, -1, 6 };
            int targetSum = 10;


            List<int> arrayList = new List<int>();




        }
    }
}
