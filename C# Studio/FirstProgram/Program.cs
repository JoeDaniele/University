using MyUtilities;
using System;

namespace FirstProgram
{
    class CheckComfort
    {
        static void Main(string[] args)
        {
            WeatherUtilities.Report("OKC", 75, 30); //city/temp/humid
            Console.WriteLine();
        }

        static float FahreinheitToCelsius(float temperatureFahrenheit)
        {
            float temperatureCelsius = (temperatureFahrenheit - 32) / 1.8f;
            return temperatureCelsius;
        }
    }
}
