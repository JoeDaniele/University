package hardway; // package
import static java.lang.System.*;  // imports System.
import java.util.Scanner; // imports user input 
public class Ch49SEARCHINGARRAY { //Searching in an Array
	public static void main(String[] args) { // main
		Scanner k = new Scanner(System.in); // user input from k
		
		int[] orderNumbers = { 12345, 54321, 101010,  // array
							   8675309, 31415, 271828, 696969, 696969
		};  
		
		int toFind;   //variable "toFind" set as an int
		
		out.print("There are " + orderNumbers.length);//use length to 
		out.println(" orders in the database.");// get capacity of array "6 values"
		
		out.print("Orders: "); //print
		for (int num : orderNumbers) { //for each int num in array orderNum
			out.print(num + " "); //print the numbers, space em out
		}
		out.println(); // print line for create space
		
		out.print("Which order to find?\n"); //print
		toFind = k.nextInt(); // creating a value for toFind from user 
		
		for (int num : orderNumbers) { // for each int num in array orderNum
			if (num == toFind) { // if the users input is in array
				out.println(num + " found."); // print the array value and "found"
				
				k.close();
			}
			if (num != toFind) {
				out.println("You didn't enter an array value.");
				break;
			}	
		}
	}
}
/*  Drill 1: could you declare int num on line 11 and remove 
	int" from the for loops?
	---- no....?
	
	2:Change the code so that if the order number is not found, it prints out a 
	message saying so. 
	-- for starters I'm a genius since I thought of this before I finished so 
	get shit on Professor, also: 
	DID THAT SHIT 1ST TRY OOO WEE BOI 
	
 */
