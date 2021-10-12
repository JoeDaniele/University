package hardway;

//NESTED IF STATEMENTS 
import static java.lang.System.*;
import java.util.Scanner;

public class Ch21IFELSEIF {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String title;

		out.print("First name: ");
		String first = keyboard.next();
		out.print("Last name: ");
		String last = keyboard.next();
		out.print("Gender (M/F): ");
		String gender = keyboard.next();
		out.print("Age: ");
		int age = keyboard.nextInt();

		if (age < 20) {
			title = first;
		} else {
			if (gender.equals("F")) {
				out.print("Are you married, " + first + "? (Y/N): ");
				String married = keyboard.next();
				if (married.equals("Y")) {
					title = "Mrs.";
				} else {
					title = "Ms.";
				}
			} else {
				title = "Mr.";
			}
		}
		out.println("\n" + title + last);
		keyboard.close();
	}
}