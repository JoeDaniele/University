namespace Gradebook
{
    public class fibbonacci
    {
        public static int fib(int i)
        {
            if (i <= 2) return 1;
            return fib(i - 2) + fib(i - 1);
        }

        static void main(string[] args)
        {
            System.Console.WriteLine(fib(10));
        }
    }
}