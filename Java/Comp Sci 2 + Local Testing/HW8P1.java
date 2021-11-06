package CompSci2;

import java.util.Scanner;

public class HW8P1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		Instrument myInstrument = new Instrument();
		StringInstrument myStringInstrument = new StringInstrument();

		String instrumentName, manufacturerName, stringInstrumentName, stringManufacturer;
		int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;

		instrumentName = k.nextLine();
		manufacturerName = k.nextLine();
		yearBuilt = k.nextInt();
		k.nextLine();
		cost = k.nextInt();
		k.nextLine();
		stringInstrumentName = k.nextLine();
		stringManufacturer = k.nextLine();
		stringYearBuilt = k.nextInt();
		stringCost = k.nextInt();
		numStrings = k.nextInt();
		numFrets = k.nextInt();

		myInstrument.setName(instrumentName);
		myInstrument.setManufacturer(manufacturerName);
		myInstrument.setYearBuilt(yearBuilt);
		myInstrument.setCost(cost);
		myInstrument.printInfo();

		myStringInstrument.setName(stringInstrumentName);
		myStringInstrument.setManufacturer(stringManufacturer);
		myStringInstrument.setYearBuilt(stringYearBuilt);
		myStringInstrument.setCost(stringCost);
		myStringInstrument.setNumOfStrings(numStrings);
		myStringInstrument.setNumOfFrets(numFrets);
		myStringInstrument.printInfo();

		System.out.println("   Number of strings: " + myStringInstrument.getNumOfStrings());
		System.out.println("   Number of frets: " + myStringInstrument.getNumOfFrets());

		k.close();
	}
}
