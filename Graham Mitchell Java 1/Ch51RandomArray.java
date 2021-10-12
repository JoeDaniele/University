package hardway;
import static java.lang.System.*;
import java.util.Scanner;
public class Ch51RandomArray {
	public static void main(String[] args) {
		int[] arr = new int[3];
		//use a for loop to access each slot of an array
		for (int i = 0; i < arr.length; i++) { //INDEX ON AN ARRAY
			arr[i] = 1 + (int)(Math.random()*100); //RANDOM VALUES IN ARRAY EVERY TIME
		}
		// displaying ALL values in array: 
		out.print("Values: ");
		for (int i = 0; i < arr.length; i++) {
			out.print(arr[i] + " ");
		}
		out.println();
		//Prof wants to break down each array, loop, index, etc.
		//Entering a number into each slot of the array, one at a time:
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;
		
		//display the values in these slots, one at a time.
		out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

		//Put a random number 1-100 into each slot of the array, one at at time.
		arr[0] = 1 + (int)(Math.random()*100); // same as line 9
		arr[1] = 1 + (int)(Math.random()*100); // same as line 9
		arr[2] = 1 + (int)(Math.random()*100); // same as line 9
		//display them one at at time:
		out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);	
		
		out.print(arr[1] + " ");

	}
}
