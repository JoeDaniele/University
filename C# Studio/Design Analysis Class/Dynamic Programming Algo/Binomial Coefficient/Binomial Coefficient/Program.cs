using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading;

/*Dynamic programming is nothing but recursion with memorization 
 * https://towardsdatascience.com/beginners-guide-to-dynamic-programming-8eff07195667
 * Chose dynamic over divide/conquer because googling Binomial Coefficient only showed Dynamic answers
 * Familiarity with recursions as a concept made sense too 
 * https://www.geeksforgeeks.org/binomial-coefficient-dp-9/
 * https://www.geeksforgeeks.org/space-and-time-efficient-binomial-coefficient/
 * https://stackoverflow.com/questions/4079278/view-more-than-one-project-solution-in-visual-studio
 */
namespace Binomial_Coefficient
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Press Enter to calcualte the Binomial Coefficient where k = 2 and n = 5, using Dynamic Programming. ");

            var userInput = Console.ReadKey();
            if (userInput.Key == ConsoleKey.Enter)
            {
                int k = 2, n = 5;
                Console.Write("Value of C(" + n + "," + k + ") is "
                                      + Dynamic(n, k));
            }



            Console.WriteLine("\n\n\nPress 'Z' to calcualte the Binomial Coefficient where k = 2 and n = 5, using Divide and Conquer ");
            var userInputTwo = Console.ReadKey();
            if (userInputTwo.Key == ConsoleKey.Z)
            {
                int n = 5;
                int k = 2;
                Console.Write("Value of C(" + n + ", " + k + ") "
                            + "is"
                          + " " + DivConq(n, k));
                Console.WriteLine("\n\n\n");
            }
        }


        static int Dynamic(int n, int k)
        {

            //Same base cases 
            if (k > n)
                return 0;
            if (k == 0 || k == n)
                return 1;

            // Recursive function call
            return Dynamic(n - 1, k - 1)
                + Dynamic(n - 1, k);
        }
        static int DivConq(int n, int k)
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
