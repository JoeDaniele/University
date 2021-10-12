package hardway;
import java.util.Scanner;
import static java.lang.System.*;
class Actor { // method outside main 
	String name;  // 3 strings inside class
	String role; 
	String birthdate;
}
public class Ch54ARRAYWHILELOOP { 
	public static void main(String[] args) throws Exception { // main w/ exception
		String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt"; // exception here
	 // Scanner inFile = new Scanner(new java.io.File("s01e01-cast.txt")); 
		Scanner inFile = new Scanner((new java.net.URL(url)).openStream()); //openStream reads
																			//directly from URL
//study drill	
		int count = 0;
		while (inFile.hasNext()) { // while inFile has next (more data), repeat
			Actor a = getActor(inFile); // 
			out.print(a.name + " was born on " + a.birthdate);
			out.println(" and played " + a.role);
			count++;
//study drill	
	}		out.print(count);
}	
	//TEXTBOOK CHALLENGE: Add a counter inside the loop that reads in all the records. After the loop is over
	//					  display a message on the screen about how many records were processed -- SEE FOR LOOP LINE 20 
	
		//inFile.close();  //close input on while loop? //necessary? //use less memory?
	public static Actor getActor(Scanner input) { // new method calls line 4 method, url input
		Actor a = new Actor(); // sets actor method to a, implementing strings 
		a.name = input.nextLine(); // name, role, bday will be input from URL -- NOT USER
		a.role = input.nextLine(); //INPUT FROM URL NOT USER 
		a.birthdate = input.nextLine(); // INPUT FROM URL NOT USER 
		return a; // print a which is the actor method/class/function
	}
}