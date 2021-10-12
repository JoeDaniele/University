package DiscreteStructures;

public class DirtyMatrix {
	public static void main(String[] args) {
		// creating two matrices
		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } }; // 2 sets of brackets
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } }; // first for the row, second for the column

		// this matrix will store the sum of two arrays (matrices)
		int c[][] = new int[3][3];
		// 3 rows and 3 columns

		for (int i = 0; i < 3; i++) { // both for loops identify the 3 values within the arrays (matrices) above
			for (int j = 0; j < 3; j++) { // they attribute the indices of the arrays to i and j
				c[i][j] = a[i][j] + b[i][j]; // changing the operation (+, -, /, *)
				System.out.print(c[i][j] + " "); // will change the result
			}
			System.out.println();
		}
		System.out.println("\n");
		// Same values however the operation is *
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
