using System;

namespace BinPackingFavoritexd
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var stopwatch = new System.Diagnostics.Stopwatch();
            stopwatch.Start();

            int[] weight = { 2, 5, 4, 7, 1, 3, 8 };
            int capacity = 10; //represents capacity
            int n = weight.Length;
            Console.WriteLine("Number of bins required" +
                    " in Next Fit : " + nextFit(weight, n, capacity));
            stopwatch.Stop();
            Console.WriteLine($"Time elapsed: {stopwatch.Elapsed} ");
        }

        static int nextFit(int[] weight, int n, int capacity)
        {
            int res = 0, bin_remaining = capacity; //10

            for (int i = 0; i < n; i++)
            {
                if (weight[i] > bin_remaining)
                {
                    res++;
                    bin_remaining = capacity - weight[i];
                }
                else
                    bin_remaining -= weight[i];
            }
            return res;
        }
    }
}

