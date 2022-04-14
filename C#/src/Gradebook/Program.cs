using System; //System namespace == java.lang.* to remove explicit typing
using System.Collections.Generic;

namespace Gradebook
{
    class Program
    {
        static void Main(string[] args)
        {
            var book = new Book("Master Book");
            book.AddGrade(89.1);
            book.AddGrade(90.5);
            book.AddGrade(77.5); //B = class name : b = variable name
            book.ShowStats();
        }
    }
}