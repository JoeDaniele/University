package hardway;
import java.util.Scanner;
import static java.lang.System.*;
class TemperatureSample{
	int month, day, year;	 // whole numbers 
	double temperature; } 	// decimals

public class Ch56 { 	// ARRAY OF RECORDS FROM A FILE -- TEMPERATURES REVISIT 
	public static void main(String[] args) throws Exception {
		String site = "https://learnjavathehardway.org";
		String path = "/txt/avg-daily-temps-with-dates-atx.txt";
		Scanner inFile = new Scanner((new java.net.URL (site+path)).openStream());
			//review this
			//new array for temps 
		TemperatureSample[] tempDB = new TemperatureSample[10000];
		int numRecords, i = 0; 	// creating numRecords int & setting i to 0
			//while loop, select "ITERATE W/ ITERATOR"
		while (inFile.hasNext() && i < tempDB.length) { // while infile has string and 0 is < DB length
			TemperatureSample e = new TemperatureSample(); // calling tempsamp method
			e.month = inFile.nextInt(); //setting month with array from file
			e.day = inFile.nextInt(); // setting day with array from file
			e.year = inFile.nextInt(); // setting year with array from file 
			e.temperature = inFile.nextDouble(); // setting temp with array from file 
			if (e.temperature != -99) {
				// if the temperature in the array != -99
				
			tempDB[i] = e; // the array of tempDB is -99 // need more understanding of this 
			i++; //i++ == continue, “skip the rest of the lines of code in the body of the loop and just
								   //go back up to the top for the next iteration.”
		}
		}
			inFile.close(); //close infiles scanner, same as closing keyboard scanner
			numRecords = i; // numrecords is set to the new i value from the if statement 
			
			out.println(numRecords + " daily temperatures loaded."); //print the number of records 
																//we calculated from the if statement
			
			double total = 0, avg; // creating 2 doubles, avg is tbd and total is 0
			int count = 0; // set coounter to 0, we increment later
			for (i = 0; i<numRecords; i++ ) { // for when 0 < numRecords, increment 
				if (tempDB[i].month == 11) { //if the array of months equals 11
					total += tempDB[i].temperature; // new total = 0 + 'array of' temperature
					count++; //increment
				}
			}
			avg = total / count; 
			avg = roundToOneDecimal(avg); // avg is calculated by using avg in method47
			out.print("Average daily temperature over " + count); // print
			out.print(" days in November: " + avg); // print 
	}			
	public static double roundToOneDecimal(double d) { //double method. var d to be replaced in main
		return Math.round(d*10)/10.0; // double d is replaced by avg when called in main method 
	}			
}