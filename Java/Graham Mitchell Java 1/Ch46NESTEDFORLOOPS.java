package hardway;
import static java.lang.System.*;
public class Ch46NESTEDFORLOOPS { // NESTED FOR LOOPS 
	public static void main(String[] args) {
	//#1 ("CN" in textbook)
	// F IS FOR FALSE IN NOTES
		for  (int n = 1; n <= 3; n++) { // for when A <= E, increment until condition F
			for (char c = 'A'; c <= 'E'; c++) { // for when n <= 3, increment until condition F
				out.println(c + " " + n); //when both loops true, print
			}
		}
		
		out.println("\n"); // create line to separate CN from AB
		
		//#2 ("AB" in textbook")
		
		for (int a = 1; a <= 3; a++) { //for when 1<=3, increment until condition F
			for (int b = 1; b <= 3; b++) {// for when 1<=3, increment until condition F
				out.println("(" + a + "," + b + ")"); //both loops true, print
			}
		// code for later per textbook	
		}
		
		out.println("\n"); //line separating 
	}
}
/* STUDY DRILLS
 * 1) FOR FIRST SET OF NESTED LOOPS (CN) WHICH VARIABLE CHANGES FASTER? 
 * OUTER LOOP c OR INNER LOOP n?
 * ---TRICK QUESTION? THE VARIABLES CHANGE AT THE SAME SPEED
 * 2) CHANGE THE ORDER OF THE LOOPS SO THAT THE "c" LOOPS IS ON THE INSIDE 
 * AND THE "n" LOOP IS OUTSIDE, HOW DOES THE OUTPUT CHANGE?
 * ---GUESS: BEFORE CHANGING: NUMBERS LEFT, LETTERS RIGHT -- E.G. REVERSE 
 * ---ANSWER:  ANOTHER TRICK, OUTPUT DOES NOT CHANGE BECAUSE THE PRINT STATEMENT DID NOT CHANGE
 */