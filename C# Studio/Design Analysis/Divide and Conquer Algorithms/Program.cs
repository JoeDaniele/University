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

/* Create to arraylists that sort both ways. 
 * 
 * Import a list of numbers and loop through it to assign an idex to each element. 
 * 
 * Time one and time the other. 
 */
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace Divide_and_Conquer_Algorithms
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var stopwatch = new System.Diagnostics.Stopwatch();
            stopwatch.Start();

            NumbersFile();

            //ArrayList MergeTest = new ArrayList();
            //ArrayList QuicksortTest = new ArrayList();
            stopwatch.Stop();
            System.Console.WriteLine($"\nExecution time: {stopwatch.ElapsedMilliseconds}ms");
            System.Console.WriteLine("\nQuick test shows debugging program adds additional 10ms.");

        }

        static void NumbersFile()
        {
            string FilePath = (@"C:\Misc\GithubMain\C# Studio\Design Analysis\Divide and Conquer Algorithms\1-50.txt");


            List<string> NumbersFile = File.ReadAllLines(FilePath).ToList();
            foreach (var line in NumbersFile)
            {
                System.Console.WriteLine(line);
            }
        }
    }
}
