package aLee;

public class Recursion2 {

	public static void main(String[] args) {

		hello(5); // call method, baseCase 5

	}

	static void hello(int n) {			
		if (n == 0) { 					
			System.out.println("Done.");
		} else {						
			System.out.println("Hello."); 
			n--; 						
			hello(n); 					
		}
	}

}

/*
 * TWO RULES FOR RECURSION: IT HAS TO CALL ITSELF INSIDE THE METHOD IT HAS TO
 * KNOW WHEN TO STOP (BASE CASE)
 */


//method with parameter n 
// if n equals 0 do the following
// print done
// IF n DOES NOT EQUAL 0, RUN THIS CODE
//decrement
// call method inside method to recur 



