package hardway;
import static java.lang.System.*;
import java.util.Scanner;
public class Ch30WHILEIFELSE { 					//ADDING VALUES ONE AT A TIME (RUNNING TOTAL)
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int current, start, total = 0; 		// two ints, current tbd and total is set to zero
		
		out.println("Type in random values and I'll give you the total."); // print
		out.println("I'll end when you type a zero."); //print
		out.println("Enter your starting value: ");
		start = keyboard.nextInt();
		
		while (start != 0) {
			out.print("\nNew Value: ");
			current = keyboard.nextInt();
			total += current;
			if (current != 0) {
				out.print("Total so far is: " + (total+start));
			} else {
				out.println("\tFinal total: "+(total+start)+".");
				break;
			}
		}
		keyboard.close();
	}		
}

/*do { // do the following WHILE THE CURRENT DOES NOT EQUAL ZERO 
			out.print("Value: "); 		// print
			current = keyboard.nextInt(); 	//requesting current number from user
			total += current; 		// += is addition, increasing the current int 
			out.println("The total so far is " + total); // print total within do statement
		} while (current != 0); 	//while the current DOES NOT equal zero, run above.
*/