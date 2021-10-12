package aLee2;

import java.time.LocalDate; // GENERATED FROM LINE 8 AUTOMATICALLY 
import java.time.LocalTime;

public class DateAndTime {
	public static void main(String [] args) {
		
		LocalDate l = LocalDate.now(); // GENERATES IMPORT STATEMENT -- localdate is just another object
		
		System.out.print(l);
		
		LocalTime t = LocalTime.now();
		
		System.out.print("\n" + t);
		
	}
}
