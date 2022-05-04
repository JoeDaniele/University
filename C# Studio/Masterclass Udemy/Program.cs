using System;

namespace Masterclass_Udemy
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] names = { "Lennox Lewis", "Joe Daniele", "Manny Pacquiao", "Roberto Duran", "Ray Leonard" };

            foreach (string name in names)
            {
                Console.WriteLine($"{name}! Welcome to the program.");
            }
            Console.ReadKey();

            /* Creating arraylist of names followed by a foreach loop
             * for each loop cycles thru the names
             * prints each each name using string interpolation 
             */

        }
    }
}
