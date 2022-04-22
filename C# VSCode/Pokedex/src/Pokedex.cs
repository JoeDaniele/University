using System;
using System.Collections.Generic;
using System.IO;

namespace src
{
    class Pokedex
    {
        static void Main(string[] args)
        {
            // Open the text file using a stream reader.
            using (var sr = new StreamReader("Starters.txt"))
            {
                Console.WriteLine(sr.ReadToEnd());
            }

        }
    }
}