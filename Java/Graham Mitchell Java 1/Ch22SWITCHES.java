package hardway;
//Making Decisions with a big switch
import java.util.Scanner;
import static java.lang.System.*;
public class Ch22SWITCHES {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int month, days;
		String monthName;
		
		out.print("Which month? (1-6) ");
		month = keyboard.nextInt();
		
		switch(month) {
		case 1: monthName = "January";
			break;
		case 2: monthName = "February";
			break;
		case 3: monthName = "March";
			break;
		case 4: monthName = "April";
			break;
		case 5: monthName = "May";
			break;
		case 6: monthName = "June";
			break;
		default: monthName = "error";
		}
		
		switch(month) {
		case 1:
		case 4:
		case 5:
		case 6: days = 30;
			break;
		case 2: days = 28;
			break;
		default: days = 30;
		}
		out.print("There are " + days + " days in " + monthName);
	}	
}
