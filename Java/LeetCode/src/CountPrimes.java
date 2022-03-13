import java.util.Scanner;

public class CountPrimes {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int u = k.nextInt();
        countPrimes(u);
    }

    public static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}