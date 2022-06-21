using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading;

namespace Masterclass
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i < 20; i += 2)
            {
                Console.WriteLine(i);
            }

            Console.WriteLine("\n");

            int lengthoftext = 0;
            int counter = 0;
            string wholeText = "";
            do
            {
                Console.WriteLine("Enter the name of a friend: ");
                string name = Console.ReadLine();
                int currentLength = name.Length;
                lengthoftext += currentLength;
                wholeText += name;
            } while (lengthoftext < 10);
            Console.WriteLine("Thats all folks!" + wholeText);
            Console.Read();

        }
    }
}
