package aLee;

public class Loops {

	public static void main(String []args) {
	
	int a = 2;
	
	System.out.println("Below I will run a series of methods: ");
	
	System.out.println("\nStart FOR LOOP" + "\nDOESNT RUN IN SEPARATE METHOD");
	for_loopy(a); // FOR LOOP WONT RUN INSIDE NEW METHOD -- WILL RUN IN MAIN?
	System.out.println("End FOR LOOP -- START WHILE LOOP");
	while_loopy();
	System.out.println("End WHILE LOOP -- START DO METHOD");
	do_method();
	System.out.println("End DO METHOD -- START ARRAY");
	array_cars();
	System.out.println("End ARRAY -- START NESTED LOOPS");
	//nested_loops();
	System.out.println("END NESTED LOOP --");
	
}
	public static void for_loopy(int a) {
		for (int i = 0; i < 3; i++); // Start, End, Increment/Decrement
			System.out.println();
	}
	public static void while_loopy() {	
		int a = 0; // set a to zero
		while(a < 5) { // while variable a is less than 5
			System.out.println("Bacon."); // print bacon
			a++; // increment a each time the while loop runs
		}	
	}
	public static void do_method() {	
		int a = 0;		
		do {
			System.out.println("Do while"); 
			a++;
		} while (a < 5); 
	}	
	public static void array_cars() {
	String [] cars = {"bmw", "vw", "toyota"}; // array of cars
		
	for(String c : cars) {  // For statement; string c is set to cars array above
		System.out.println(c); // print c, which is cars, which is the array, line by line
	}
//}
	//public static void nested_loops() {
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; i < 5;) {
				System.out.println(i + " " + j);
				break;
			}
		}
	}
	
}