package CompSci2;

import java.util.Scanner;

public class modulotest {
	public static void main(String args[]) {
		Scanner k = new Scanner(System.in);

		System.out.println("Enter two integers and you'll receive the inverse modulo: ");
		int a, m;

		a = k.nextInt();
		m = k.nextInt();

		System.out.println(modInverse(a, m));
		k.close();
	}

	static int modInverse(int a, int m) {

		for (int x = 1; x < m; x++)
			if (((a % m) * (x % m)) % m == 1)
				return x;
		return 1;
	}
}
