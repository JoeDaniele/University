package DiscreteStructures;

public class Exam6 {
	public static void main(String[] args) {
		double probability = .5;
		double days = 366;
		double people = 2;

		double probability2ndMatch1st = ((days - 1) / days);

		System.out.println(
				"Odds of having two people in the same room with the same birthday: " + (1 - probability2ndMatch1st));

		double odds3NoMatch = (days - 2) / (days); // equations based on textbook description

		System.out
				.println("Odds that all 3 have different birthdays: " + (odds3NoMatch * probability2ndMatch1st) + "\n");

		double currentOdds = 1.0;
		for (int i = 1; i < 58; i++) {
			currentOdds = (currentOdds) * ((days - i) / days);
			System.out.println("People in the room: " + (i + 1) + "\tOdds of a match: " + (1 - currentOdds));
		}

	}
}
