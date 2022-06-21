using System;

namespace Masterclass_Udemy
{
    internal class ForEach
    {
        static void Main(string[] args)
        {
            string[] friends = { "Lennox Lewis", "Joe Daniele", "Manny Pacquiao", "Roberto Duran", "Ray Leonard" };

            foreach (string name in friends)
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
