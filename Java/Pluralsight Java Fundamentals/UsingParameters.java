package Pluralsight;

//test method
public class UsingParameters {
	public static void main(String[] args) {

		showSum(7.5, 1.4, 2);
		System.out.println("ended showSum method.");

		double result = calculateInterest(100, .05, 10);
		System.out.println(result);

	}

	static void showSum(double x, double y, int count) {
		if (count < 1)
			return;
		double sum = x + y;
		for (int i = 0; i < count; i++)
			System.out.println(sum);
		return;
	}

	static double calculateInterest(double amt, double rate, int years) {
		return (amt * rate * years);
	}
	
	
	
	static double[] produceInterestHistory(double amt, double rate, int years) 
	{
		double[] accumulatedInterest = new double[years];
		for (int yearIndex = 0; yearIndex < years; yearIndex++) {
			int year = yearIndex + 1;
			accumulatedInterest[yearIndex] = calculateInterest(amt, rate, year);
		}
		return accumulatedInterest;
		
	}
}
