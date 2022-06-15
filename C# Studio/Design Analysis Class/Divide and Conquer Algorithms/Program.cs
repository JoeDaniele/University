/*
    Mergesort VS Quicksort performance in relation to big o.

 * Research memory requirements, 
 * time complexitry,
 * algorithm complexity (difficulty). 
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
            //stopwatch.Start();

            Random rand = new Random();
            int[] numbers = new int[10000];
            for (int i = 0; i < numbers.Length; i++)
            {
                numbers[i] = rand.Next(100);
            }


            printArray(numbers);
            stopwatch.Start();
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
                printArray(numbers);
                quicksort(numbers);

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



        private static void quicksort(int[] array)
        {
            quicksort(array, 0, array.Length - 1);
        }

        private static void quicksort(int[] array, int lowIndex, int highIndex)
        {

            if (lowIndex >= highIndex)
            {
                return;
            }

            int pivotIndex = new Random().Next(highIndex - lowIndex) + lowIndex;
            int pivot = array[pivotIndex];
            swap(array, pivotIndex, highIndex);

            int leftPointer = partition(array, lowIndex, highIndex, pivot);

            quicksort(array, lowIndex, leftPointer - 1);
            quicksort(array, leftPointer + 1, highIndex);

        }

        private static int partition(int[] array, int lowIndex, int highIndex, int pivot)
        {
            int leftPointer = lowIndex;
            int rightPointer = highIndex - 1;

            while (leftPointer < rightPointer)
            {

                while (array[leftPointer] <= pivot && leftPointer < rightPointer)
                {
                    leftPointer++;
                }

                while (array[rightPointer] >= pivot && leftPointer < rightPointer)
                {
                    rightPointer--;
                }

                swap(array, leftPointer, rightPointer);
            }
            if (array[leftPointer] > array[highIndex])
            {
                swap(array, leftPointer, highIndex);
            }
            else
            {
                leftPointer = highIndex;
            }

            return leftPointer;
        }

        private static void swap(int[] array, int index1, int index2)
        {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

        private static void printNewArray(int[] numbers)
        {
            for (int i = 0; i < numbers.Length; i++)
            {
                Console.WriteLine(numbers[i]);
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
