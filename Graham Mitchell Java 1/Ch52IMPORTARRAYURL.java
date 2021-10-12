package hardway;

import java.net.URL; // import line 7
import java.util.Scanner; // user input
import static java.lang.System.*; // imports system to remove for printing -- e.g. lazy

public class Ch52IMPORTARRAYURL { // "Lowest Temperature"
	public static void main(String[] args) throws Exception { // main w/ exception
		String urlbase = "https://learnjavathehardway.org/txt/";
		double[] temps = arrayFromUrl(urlbase + "avg-daily-temps-atx.txt"); // exception needed here

		out.println(temps.length + " temperature in database."); // length of temps array

		double lowest = 99.99; // lowest is set here as a double

		for (int i = 0; i < temps.length; i++) { // increment i less than the temps.length
			if (temps[i] < lowest) { // if temps value is less than the lowest (line12)
				lowest = temps[i]; // lowest (double) equals temps value
			}
		}
		out.print("Lowest average daily temperature was: ");
		out.println(lowest + " F (" + fToC(lowest) + "C)"); // print new lowest + ftoc method
//print the highest average daily temperature -- study drill  -- DONE
		for (int i = 0; i < temps.length; i++) {
			if (lowest < temps[i]) { // all I did was switch lowest and temps from line 15
				lowest = temps[i];
			}
		}
		out.print("Highest average daily temperature was: ");
		out.println(lowest + " F (" + fToC(lowest) + "C)");
	}

	public static double[] arrayFromUrl(String url) throws Exception { // new method w/ exception
		Scanner k = new Scanner((new URL(url)).openStream()); // exception needed here
		int count = k.nextInt(); // count int set to next user input

		double[] dubs = new double[count]; // dubs array equals new count double

		for (int i = 0; i < dubs.length; i++) // for when i < dubs.length, increment
			dubs[i] = k.nextDouble(); // dubs array is equal to next user input
		k.close(); // close scanner
		return dubs; // return dubs array
	}

	// FTOC == FEHREINHEIT TO CELSIUS
	public static double fToC(double f) { // new method using double for decimal
		return (f - 32) * 5 / 9; // return f (double) and calculation
	}
}