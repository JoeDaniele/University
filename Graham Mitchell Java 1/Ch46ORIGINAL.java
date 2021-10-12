package hardway;
import static java.lang.System.*;
public class Ch46ORIGINAL{ // NESTED FOR LOOPS 
	public static void main(String[] args) {
	//#1 ("CN" in textbook)
	// F IS FOR FALSE IN NOTES
		for (char c = 'A'; c <= 'E'; c++) { // for when A <= E, increment until condition F
			for (int n = 1; n <= 3; n++) { // for when n <= 3, increment until condition F
				out.println(c + " " + n); //when both loops true, print
			}
		}
		
		out.println("\n"); // create line to separate CN from AB
		
		//#2 ("AB" in textbook")
		
		for (int a = 1; a <= 3; a++) { //for when 1<=3, increment until condition F
			for (int b = 1; b <= 3; b++) {// for when 1<=3, increment until condition F
				out.println("(" + a + "," + b + ")"); //both loops true, print
			}
			out.println("Drill question #4"); // code for later per textbook	
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
 * --- GUESSING BEFORE CHANGING: NUMBERS LEFT, LETTERS RIGHT -- E.G. REVERSE 
 * 3) 2ND LIST OF LOOPS (AB); CHANGE PRINT STATEMENT TO PRINTLN -- WHAT HAPPENS?
 * ---ALREADY DONE -- EZ
 * 4) ADD A PRINT ON LINE 21 AS INDICATED. WHAT HAPPENS?
 * GUESS: IT WILL PRINT IN BETWEEN EACH LOOP 
 * ---- IT PRINTS WHEN THE INTILIAIZATION HAS BEEN FULFILLED 
 * 
 */