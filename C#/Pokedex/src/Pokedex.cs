using System;
using System.Collections.Generic;
using System.IO;

namespace src
{
    class Pokedex
    {
        static void Main(string[] args)
        {
            System.Console.WriteLine("oi");

            // Open the text file using a stream reader.
            using (var sr = new StreamReader("Starters.txt"))
            {
                // Read the stream as a string, and write the string to the console.
                Console.WriteLine(sr.ReadToEnd());
            }




        }
    }
}