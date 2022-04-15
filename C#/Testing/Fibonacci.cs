namespace Fib
{
    public class fibbonacci
    {
        static void Main(string[] args)
        {
            int N = 10;
            Fibonacci(N);
        }

        static void Fibonacci(int N)
        {
            int num1 = 0, num2 = 1;
            int counter = 0;

            while (counter < N)
            {

                System.Console.WriteLine(num1);

                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;
            }
        }
    }
}