package hardway;
import static java.lang.System.*;
//import java.util.Iterator;
import java.util.Scanner;
public class Ch44INCREMENTING {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		int i;  //set int to i 
		String message; //message string 
		
		out.println("Enter a message and it will display 5 times.");
		out.print("Message: ");
		message = k.next();  // message string is set to user
		k.close(); // end user ability to input
		
		for (i = 1; i <= 5; i++) { // i is less than or equal to 5, increment
			out.println(i + ". " + message); // print i, ., print message string
		}
	
		out.println("\nNow I'll show it 10 times and count by 5s.");
		for (i = 5; i <= 50; i+= 5) { // 5 is less than or equal to 50; increment by 5
			out.println(i + ". " + message);						// until 50
		}
		
		out.println("\nFinally, three times counting backward.");
		for (i = 3; i > 0; i-= 1) {  // 3 is greater than 0, decrement by 1 until 1
			out.println(i + ". " + message);
		
	}
  }
}

// 3 PARTS TO THE FOR LOOP
// INITIALIZATION i = 1;
// CONDITION i < 5;
// UPDATE STATEMENT i++
