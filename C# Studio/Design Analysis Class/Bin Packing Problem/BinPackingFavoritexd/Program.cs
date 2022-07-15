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

        static int nextFit(int[] weight, int n, int c)
        {
            int res = 0, bin_rem = c; //10

            for (int i = 0; i < n; i++)
            {
                if (weight[i] > bin_rem)
                {
                    res++;
                    bin_rem = c - weight[i];
                }
                else
                    bin_rem -= weight[i];
            }
            return res;
        }
    }
}

