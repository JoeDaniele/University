using System;
using System.Collections.Generic;
using System.Text;

namespace Masterclass
{
    //this class is a blueprint for a data type
    class Human
    {
        //member variable
        public string firstName;
        public string lastName;


        public void Introduction()
        {
            Console.WriteLine($"Hi, I am: {firstName} {lastName}");
        }

    }
}
