package DiscreteStructures;

public class Exam4 {

	public static void main(String[] args) {
		OperationsCounter recursiveStat = new OperationsCounter();
		OperationsCounter iterativeStat = new OperationsCounter();

		// RECURSIVE
		for (int fibNum = 0; fibNum <= 50; fibNum += 10) {
			recursiveStat.startTimer();
			System.out.println("The recursive " + fibNum + "the fibonacci number is: " + fib(fibNum, recursiveStat)
					+ " IFS: " + recursiveStat.getIfCount() + " add or subract: " + recursiveStat.getAddCount());
			recursiveStat.stopTimer();
			System.out.println("milliseconds: " + recursiveStat.getTime());
			recursiveStat.resetIfCount();
			recursiveStat.resetAddCount();
		}
		System.out.println("");
		// ITERATIVE
		for (int fibNum = 0; fibNum <= 50; fibNum += 10) {
			iterativeStat.resetIfCount();
			iterativeStat.resetAddCount();

			iterativeStat.startTimer();
			System.out.println(
					"The iterative " + fibNum + "th fibonacci number is: " + fibonacciIterative(fibNum, iterativeStat)
							+ " IFS: " + iterativeStat.getIfCount() + " add or subract: " + iterativeStat.getAddCount()
							+ " assignments: " + iterativeStat.getAssignmentCount());
			iterativeStat.stopTimer();
			System.out.println("milliseconds: " + iterativeStat.getTime());
		}

	}

	public static int fibonacciIterative(long nthNumber, OperationsCounter iterativeStat) {
		int previouspreviousNumber, previousNumber = 0, currentNumber = 1;
		iterativeStat.increaseAssignmentOperations(3);
		iterativeStat.increaseIf();
		for (int i = 1; i < nthNumber; i++) {
			iterativeStat.increaseAssignmentOperations(1);

			previouspreviousNumber = previousNumber;

			previousNumber = currentNumber;

			currentNumber = previouspreviousNumber + previousNumber;
			iterativeStat.increaseArithmetic(1);
			iterativeStat.increaseAssignmentOperations(3);
		}
		return currentNumber;
	}

	private static long fib(long n, OperationsCounter recursiveStat) {

		if ((n == 0) || (n == 1)) {
			recursiveStat.increaseIf();
			return n;
		} else {
			recursiveStat.increaseArithmetic(3);
			return fib(n - 1, recursiveStat) + fib(n - 2, recursiveStat);
		}

	}

}
