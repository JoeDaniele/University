using System;

namespace FirstProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Console.WriteLine(FahreinheitToCelsius(100)); W
        }

        static float FahreinheitToCelsius(float temperatureFahrenheit)
        {
            float temperatureCelsius = (temperatureFahrenheit - 32) / 1.8f;
            return temperatureCelsius;
        }
    }
}
