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
using System.Threading;

namespace Divide_and_Conquer_Algorithms
{
    internal class Program
    {
        public static void Main(String[] args)
        {

            var stopwatch = new System.Diagnostics.Stopwatch();
            stopwatch.Start();

            Random rand = new Random();
            int[] numbers = new int[10000];
            for (int i = 0; i < numbers.Length; i++)
            {
                numbers[i] = rand.Next(10000);
            }


            printArray(numbers);
            mergeSort(numbers);
            printArray(numbers);


            stopwatch.Stop();
            System.Console.WriteLine($"\nExecution time when Merge Sorting {numbers.Length} elements: {stopwatch.Elapsed}ms");

            Console.WriteLine("The first half of this program was a Merge Sort, the second half will demonstrate Quick Sorting. " +
                "\nPress ENTER to continue. ");

            var userInput = Console.ReadKey();
            if (userInput.Key == ConsoleKey.Enter)
            {
                Console.WriteLine("Program is Quick Sorting...");
                Thread.Sleep(2000);
                stopwatch.Start();

                int n = numbers.Length;
                quickSort(numbers, 0, n - 1);
                Console.Write("Sorted array: ");
                quickSortPrint(numbers, n);

                stopwatch.Stop();
                System.Console.WriteLine($"\nExecution time when Quick Sorting {numbers.Length} elements: {stopwatch.Elapsed}ms");
            }
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



        static void GfgSwap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        static int partition(int[] arr, int low, int high)
        {
            int pivot = arr[high]; //pivot is the momentary focal element in the array 
            int i = (low - 1);

            for (int j = low; j <= high - 1; j++)
            {
                if (arr[j] < pivot)
                {
                    i++;
                    GfgSwap(arr, i, j);
                }
            }
            GfgSwap(arr, i + 1, high);
            return (i + 1);
        }
        static void quickSort(int[] arr, int low, int high)
        {
            if (low < high)
            {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }
        static void quickSortPrint(int[] arr, int size)
        {
            for (int i = 0; i < size; i++)
                Console.Write(arr[i] + " ");

            Console.WriteLine();
        }

































        //had a bad idea
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
