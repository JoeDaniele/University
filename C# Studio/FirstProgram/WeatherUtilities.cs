using System;

namespace MyUtilities
{
    class WeatherUtilities
    {
        static public float FahrenheitToCelsius(float temperatureFahrenheit)
        {
            return (float)(temperatureFahrenheit - 32 / 1.8f);
        }

        static public float CelsiusToFahrenheit(float temperatureCelsius)
        {
            return (float)(temperatureCelsius * 1.8f + 32);
        }

        static float ComfortIndex(float temperatureFahrenheit, float humidityPercent)
        {
            //formula needs to be edited later 
            var comfortIndex = (temperatureFahrenheit + humidityPercent) / 4;
            return comfortIndex;
        }

        static public void Report(string location, float temperatureCelsius, float humidity)
        {
            var temperatureFahrenheit = CelsiusToFahrenheit(temperatureCelsius);
            Console.WriteLine($"Comfort Index for {location}: {ComfortIndex(temperatureFahrenheit, humidity)}");
        }
    }
}