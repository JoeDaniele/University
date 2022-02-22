package aLee;

import java.util.Scanner;

public class PackagesAPIs {

	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Name?");
		String name = scan.nextLine();
		System.out.println(name);
		scan.close(); // close scan ending all user inputs within method
	}
}


//THE SCANNER IMPORT IS AN API -- APPLICATION PROGRAMMING INTERFACE 
