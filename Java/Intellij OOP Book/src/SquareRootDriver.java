import java.util.Scanner;

public class SquareRootDriver {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double n;

        SquareRootFinder sqrt = new SquareRootFinder();

        do {
            System.out.println("Enter a number (or <=0 to quit): ");
            n = k.nextDouble();

            if (n > 0) {
                sqrt.setNumber(n);
                System.out.println(sqrt.getRoot());
            }
        } while (n > 0);

        System.out.println("Simple square root function, enter a number: ");
        int userNumber = k.nextInt();
        System.out.println(Math.sqrt(userNumber));
    }
}