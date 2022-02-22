package hardway;
import static java.lang.System.*;
class Student { // new method with 3 vars
	String name;
	int credits;
	double gpa;
}
public class Ch55ARRAYSFORLOOPS {
	public static void main(String[] args) {  //main method -- array of args -- if no args then void
		Student[] db; // Student array set to db 
		db = new Student[4]; // student string [db] creates 3 new students
		db[0] = new Student(); //sets array to new value 0, calls student method, creating new student
		db[0].name = "Esteban"; //sets value esteban to string name in array [db]
		db[0].credits = 43; // etc 
		db[0].gpa = 2.9; // etc
		 
		db[1] = new Student(); // sets array to new value 1, calls student method, creating new student 
		db[1].name = "Dave"; // sets value dave to string name in array [db]
		db[1].credits = 15;
		db[1].gpa = 4.0;
		
		db[2] = new Student();
		db[2].name = "Michelle";
		db[2].credits = 132;
		db[2].gpa = 3.72;
		
		db[3] = new Student();
		db[3].name = "Claudius";
		db[3].credits = 159;
		db[3].gpa = 4.19;
		
		// use index on an array
		for (int i = 0; i < db.length; i++) { //for when 0 is less than the db length, ++
			out.println("Name: " + db[i].name); //"ARRAY OF" NAME
			out.println("\tCredit Hours " + db[i].credits); //"ARRAY OF" CREDITS
			out.println("\tGPA:" + db[i].gpa); //"ARRAY OF" GPA
		}	//THIS LOOP IS IN BRACES BECAUSE IT CALLS THE ARRAY
		
		int maxGpa = 0; //Prof “As this point in the code, as far as I know, \
						//the highest-scoring student is in slot 0.”
		
		
		int lowCred = 0; //at this point the lowest credit student is 0.

		for (int i = 1; i < db.length; i++) //for when 1 is less than the db length, increment
			if (db[i].gpa > db[maxGpa].gpa)  //if the gpa in the array is greater than 0
				maxGpa = i; //set maxLoc to that value 
		
		// line 44 according to textbook: if ( db[1].gpa > db[0].gpa )
		//“If Dave’s GPA is greater than Esteban’s GPA, then change maxLoc from 0 to the current value of i(1).”
		
		//NEW LOOP FOR STUDY DRILL
		for (int i = 1; i < db.length; i++)  //FOR WHEN i IS LESS THAN THE DB LENGTH, INCREMENT  
			if (db[i].credits < db[lowCred].credits) // IF STUDENT 0'S CREDITS ARE LESS THAN STUDENT 1, 2, 3, CHANGE LOWCRED TO THAT NEW VALUE 
				lowCred = i;
		
			out.println(db[maxGpa].name + " has the highest GPA.");
			out.println(db[lowCred].name + " has the lowest credits.");
			//break; // without break, line 40 prints twice? 
			//FOR LOOP REPEATS IF ITS IN BRACES
	}
}
//QUESTION LINE 38: IS IT BETTER TO SET THE VALUE OUTSIDE OF THE LOOP TO 1 AND
//SET THE FOR LOOP TO 0 BECAUSE THE INDEX ON AN ARRAY BY DEFAULT IS 0

//CAN I SET MAXLOC TO 1 AND SET INT IN FORLOOP TO 0, FOR SAKE OF IT BEING EASIER TO WRITE


/* STUDY DRILL 1: CHANGE ARRAY TO HAVE CAPACITY OF 4 INSTEAD OF 3, WHAT HAPPENS
  	db[i] becomes null due to the array capacity being higher than its values
  2: ADD ANOTHER STUDENT AND MAKE SURE THE LOOP WORKS BY GIVING THEM THE HIGHEST GPA 
  	it works -- added Claudius w/ a clearly fake gpa
  3: ADD CODE SO THE PROGRAM FINDS THE STUDENT WITH THE FEWEST CREDITS
  	line 48 done -- SEE BELOW FOR EXPLANATION FROM TEXTBOOK
  
  if ( db[1].gpa > db[0].gpa )
	“If Dave’s GPA is greater than Esteban’s GPA, then change maxLoc from 0 to the current value of i
	(1).”
	So by the time the loop is over, maxLoc contains the index of the record with the highest GPA.
	Which is exactly what we display on line 56+57.
*/