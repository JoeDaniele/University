/*
    Mergesort VS Quicksort performance in relation to big o.

 * Research memory requirements, 
 * time complexitry,
 * algorithm complexity (difficulty). 
 * 
 * Create a fixture to use both algorithms on the same data set multiple times. 
 * Time how long it takes for each algorithm to complete the sorting task on average.
 * Please use an input set large enough to provide data suggesting a clear winner. 
 * Make a video where you explain the two algorithms, share your research, and present your data.
 *
 *
 *
* Create to arraylists that sort both ways. 
 * 
 * Import a list of numbers and loop through it to assign an idex to each element. 
 * 
 * Time one and time the other. 
 */
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace Divide_and_Conquer_Algorithms
{
    internal class Program
    {
        public static void Main(String[] args)
        {
            var stopwatch = new System.Diagnostics.Stopwatch();
            stopwatch.Start();

            Random rand = new Random();
            int[] numbers = new int[1000];
            for (int i = 0; i < numbers.Length; i++)
            {
                numbers[i] = rand.Next(1000);
            }


            //printArray(numbers);

            mergeSort(numbers);
            printArray(numbers);

            stopwatch.Stop();
            System.Console.WriteLine($"\nExecution time when Merge Sorting {numbers.Length} elements: {stopwatch.Elapsed}ms");
            System.Console.WriteLine("\nUnrelated but a quick test shows debugging program adds additional 10ms.");
        }


        private static void mergeSort(int[] inputArray)
        {
            int inputLength = inputArray.Length;

            if (inputLength < 2)
            {
                return;
            }

            int midIndex = inputLength / 2;
            int[] leftHalf = new int[midIndex];
            int[] rightHalf = new int[inputLength - midIndex];

            for (int i = 0; i < midIndex; i++)
            {
                leftHalf[i] = inputArray[i];
            }
            for (int i = midIndex; i < inputLength; i++)
            {
                rightHalf[i - midIndex] = inputArray[i];
            }

            mergeSort(leftHalf);
            mergeSort(rightHalf);
            merge(inputArray, leftHalf, rightHalf);
        }

        private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf)
        {
            int leftSize = leftHalf.Length;
            int rightSize = rightHalf.Length;

            int i = 0, j = 0, k = 0;

            while (i < leftSize && j < rightSize)
            {
                if (leftHalf[i] <= rightHalf[j])
                {
                    inputArray[k] = leftHalf[i];
                    i++;
                }
                else
                {
                    inputArray[k] = rightHalf[j];
                    j++;
                }
                k++;
            }

            while (i < leftSize)
            {
                inputArray[k] = leftHalf[i];
                i++;
                k++;
            }

            while (j < rightSize)
            {
                inputArray[k] = rightHalf[j];
                j++;
                k++;
            }

        }

        private static void printArray(int[] numbers)
        {
            for (int i = 0; i < numbers.Length; i++)
            {
                Console.WriteLine(numbers[i]);
            }
        }












        //considered passing in a text file and converting that to an array but that is literally stupid because you 
        //can just create a static array with as many values as you so dumb idea lol
        public static void NumbersFile()
        {
            string FilePath = (@"C:\Misc\GithubMain\C# Studio\Design Analysis\Divide and Conquer Algorithms\1-10.txt");

            List<string> NumbersFile = File.ReadAllLines(FilePath).ToList();
            foreach (var line in NumbersFile)
            {
                System.Console.WriteLine(line);
            }
        }


    }
}

/*Mergesort uses more memory depending on the number of elements in the array. 
 *Requires an addittional array for hosting n elements, potentially a drawback.
 * O(nLogn)
 *
 * 
 * 
 * 
 * 
 */
