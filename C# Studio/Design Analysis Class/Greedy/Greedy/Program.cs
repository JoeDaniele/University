using System;
using System.Collections;
/*https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
* https://stackoverflow.com/questions/50393489/knapsack-c-sharp-implementation-task
* https://www.geeksforgeeks.org/greedy-algorithms/
*https://www.geeksforgeeks.org/fractional-knapsack-problem/?ref=lbp
*
* This program solves the Knapsack Problem under the presumption that each element to enter the knapsack
* is in fact a whole number. The 4th link above solves the problem if the elements are fractional. 
* 
* 
* 
*/
namespace Greedy
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var stopwatch = new System.Diagnostics.Stopwatch();

            Console.WriteLine("First solution will use Dynamic Programming to solve the Knapsack Problem, \npress ENTER to proceed.");
            var userInput = Console.ReadKey();
            if (userInput.Key == ConsoleKey.Enter)
            {
                stopwatch.Start();
                int[] val = new int[] { 60, 100, 120 };
                int[] wt = new int[] { 10, 20, 30 };
                int W = 50;
                int n = val.Length;
                stopwatch.Stop();
                Console.WriteLine(knapSack(W, wt, val, n));
                System.Console.WriteLine($"Execution time {stopwatch.Elapsed}ms");

            }

            Console.WriteLine("\n\nSecond solution will use a Greedy Algorithm to solve the same Knapsack Problem, press ENTER to proceed.");


            var userInput2 = Console.ReadKey();
            if (userInput2.Key == ConsoleKey.Enter)
            {
                stopwatch.Start();
                item[] arr = { new item(60, 10), new item(100, 20), new item(120, 30) };

                Console.WriteLine("\nMaximum value we can obtain = " + FracKnapSack(arr, 50));
                stopwatch.Stop();
                System.Console.WriteLine($"Execution time {stopwatch.Elapsed}ms");
                Console.WriteLine("\nGreedy algorithm is slightly longer and requires significantly more code to achieve. Not worth. ");
            }




        }
        static int max(int a, int b)
        {
            return (a > b) ? a : b; // ternary operator ?
        }
        static int knapSack(int W, int[] wt, int[] val, int n)

        {
            if (n == 0 || W == 0)
                return 0;

            // If weight of the nth item is more than Knapsack capacity W,
            // then this item cannot be included in the optimal solution
            if (wt[n - 1] > W)
                return knapSack(W, wt, val, n - 1);


            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
            else
                return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
        }





        class item
        {
            public int value;
            public int weight;

            public item(int value, int weight)
            {
                this.value = value;
                this.weight = weight;
            }
        }

        // Comparison function to sort Item according to val/weight ratio
        class cprCompare : IComparer
        {
            public int Compare(Object x, Object y)
            {
                item item1 = (item)x;
                item item2 = (item)y;
                double cpr1 = (double)item1.value
                              / (double)item1.weight;
                double cpr2 = (double)item2.value
                              / (double)item2.weight;

                if (cpr1 < cpr2)
                    return 1;

                return cpr1 > cpr2 ? -1 : 0;
            }
        }

        // Main greedy function to solve problem
        static double FracKnapSack(item[] items, int w)
        {

            // Sort items based on cost per units
            cprCompare cmp = new cprCompare();
            Array.Sort(items, cmp);

            // Traverse items, if it can fit,take it all, else take fraction
            double totalVal = 0f;
            int currW = 0;

            foreach (item i in items)
            {
                float remaining = w - currW;

                // If the whole item can be taken, take it
                if (i.weight <= remaining)
                {
                    totalVal += (double)i.value;
                    currW += i.weight;
                }

                // dd fraction until we run out of space
                else
                {
                    if (remaining == 0)
                        break;

                    double fraction
                        = remaining / (double)i.weight;
                    totalVal += fraction * (double)i.value;
                    currW += (int)(fraction * (double)i.weight);
                }
            }
            return totalVal;
        }

    }

}
