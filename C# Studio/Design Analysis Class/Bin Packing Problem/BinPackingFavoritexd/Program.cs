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
            int c = 10; //represents capacity
            int n = weight.Length;
            Console.WriteLine("Number of bins required" +
                    " in Next Fit : " + nextFit(weight, n, c));
            stopwatch.Stop();
            Console.WriteLine($"Time elapsed: {stopwatch.Elapsed} ");
        }


        // Returns number of bins required
        // using next fit online algorithm
        static int nextFit(int[] weight, int n, int c)
        {

            // Initialize result (Count of bins) and remaining
            // capacity in current bin.
            int res = 0, bin_rem = c;

            // Place items one by one
            for (int i = 0; i < n; i++)
            {
                // If this item can't fit in current bin
                if (weight[i] > bin_rem)
                {
                    res++; // Use a new bin
                    bin_rem = c - weight[i];
                }
                else
                    bin_rem -= weight[i];
            }
            return res;
        }
    }
}

