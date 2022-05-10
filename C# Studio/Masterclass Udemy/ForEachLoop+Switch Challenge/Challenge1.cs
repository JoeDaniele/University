using System;
using System.Collections.Generic;
//above are "using directives" 
namespace ForEachLoop_Switch_Challenge
{
    internal class Challenge1
    {
        static void Main(string[] args)
        {
            challenge();
            DynamicList();
        }

        static void challenge()
        {
            Boolean valid = false;
            string inputValueType;

            Console.WriteLine("Enter a data type: ");
            string inputValue = Console.ReadLine();

            Console.WriteLine("Select the data type of the input you have entered: ");
            Console.WriteLine("1 for String.");
            Console.WriteLine("2 for Int.");
            Console.WriteLine("3 for Boolean.");

            Console.WriteLine("Enter: ");
            int inputType = Convert.ToInt32(Console.ReadLine());

            switch (inputType)
            {
                case 1:
                    //check for string
                    valid = IsAllAlphabetic(inputValue);
                    inputValueType = "String";
                    break;

                case 2:
                    int retValue = 0;
                    //check for integer
                    valid = int.TryParse(inputValue, out retValue);
                    inputValueType = "Integer";
                    break;

                case 3:
                    bool retFlag = false;
                    //check for boolean
                    valid = bool.TryParse(inputValue, out retFlag);
                    inputValueType = "Boolean";
                    break;
                default:
                    inputValueType = "Unknown.";
                    Console.WriteLine("Not able to detect input type.");
                    break;
            }

            Console.WriteLine($"You have entered a value: {0}", inputValue);
            if (valid)
            {
                Console.WriteLine($"It is valid : {0}", inputValueType);
            }
            else
            {
                Console.WriteLine($"It is invalid : {0}", inputValueType);
            }
        }

        static bool IsAllAlphabetic(string value)
        {
            foreach (char c in value)
            {
                if (!char.IsLetter(c))
                    return false;
            }
            return true;
        }
    }
}
