using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading;

/*Dynamic programming is nothing but recursion with memorization 
 * https://towardsdatascience.com/beginners-guide-to-dynamic-programming-8eff07195667
 * Chose dynamic over divide/conquer because googling Binomial Coefficient only showed Dynamic answers
 * Familiarity with recursions as a concept made sense too 
 * 
 * 
 * 
 */
namespace Binomial_Coefficient
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Press Enter to calcualte the Binomial Coefficient where k = 2 and n = 5, using Dynamic Programming. ");

            ConsoleKey userInput = default;
            if (userInput == ConsoleKey.Enter)
            {
                int k = 2, n = 5;
                Console.Write("Value of C(" + n + "," + k + ") is "
                                      + binomialCoeff(n, k));
            }






            //  int n = 5;
            //int k = 2;
            //Console.Write("Value of C(" + n + ", " + k + ") "
            //            + "is"
            //          + " " + binomialCoeff(n, k));
        }

        static int binomialCoeff(int n, int k)
        {

            // Base Cases (k = 2, n = 5)
            if (k > n)
                return 0;
            if (k == 0 || k == n)
                return 1;

            // Recursive function call
            return binomialCoeff(n - 1, k - 1)
                + binomialCoeff(n - 1, k);
        }
        static int binomialCoef(int n, int k)
        {
            int res = 1;

            if (k > n - k)
                k = n - k;

            for (int i = 0; i < k; ++i)
            {
                res *= (n - i);
                res /= (i + 1);
            }

            return res;
        }
    }

}
