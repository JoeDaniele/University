/*
    Mergesort VS Quicksort performance in relation to big o.

 * Research memory requirements, 
 * time complexitry,
 * algorithm complexity (difficulty). 
 * 
 * Create a fixture to use both algorithms on the same data set multiple times. 
 * 
 * Time how long it takes for each algorithm to complete the sorting task on average.
 * 
 * Please use an input set large enough to provide data suggesting a clear winner. 
 * 
 * Make a video where you explain the two algorithms, share your research, and present your data.
 */

namespace Divide_and_Conquer_Algorithms
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var stopwatch = new System.Diagnostics.Stopwatch();
            stopwatch.Start();

            for (int i = 0; i < 10; i++)
            {
                System.Console.WriteLine("HOW LONG DOES THIS TAKE TO RUN?");
            }

            stopwatch.Stop();
            System.Console.WriteLine($"Execution time: {stopwatch.ElapsedMilliseconds}ms");
        }
    }
}
