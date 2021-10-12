package hardway;

import java.util.Scanner;

class Room { // Model
	int roomNumber; // properties within Room model
	String roomName;
	String description;
	int numExits;
	String[] exits = new String[10];
	int[] destinations = new int[10];
}

public class Ch58CopyPaste { // titles
	public static void main(String[] args) { // main e.g. cmd prompt args
		Scanner keyboard = new Scanner(System.in); // user input

// initialize rooms from file
		Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt"); // IMPORT INTO THE PROJECT ITSELF -- NOT INTO THE
															// WINDOWS EXPLORER DIRECTORY

		showAllRooms(rooms);
// showAllRooms(rooms); // for debugging
// Okay, so let's play the game!
		int currentRoom = 0; //
		String ans; //
		while (currentRoom >= 0) { // while the current room is >= 0;
			Room cur = rooms[currentRoom]; // Room method assigned to cur = current room in "array of" room
			System.out.print(cur.description); // print current room description, which is from file
			System.out.print("> "); //
			ans = keyboard.nextLine(); //

// See if what they typed matches any of our exit names
			boolean found = false; // found is set to bool false
			for (int i = 0; i < cur.numExits; i++) { // for index on an array -- for when 0 is less than the number of
														// exits in the room array, increment
				if (cur.exits[i].equals(ans)) { // if the "array of" exits equals the user input
					// if so, change our next room to that exit's room number
					currentRoom = cur.destinations[i]; // currentRoom = array of destinations in room method
					found = true; // changes bool to true if so
				}
			}
			if (found == false) // if user input not found print following line (can be printed (!false))
				System.out.println("Sorry, I don't understand.");
		}
		keyboard.close(); // close user input from scanner
	}

	public static Room[] loadRoomsFromFile(String filename) { // new method/function operates as the text file import
		Scanner file = null; // no scanner file ?
		try { // try statement -- new
			file = new Scanner(new java.io.File(filename)); // set file var to the imported txt.file
		} catch (java.io.IOException e) { // exception will occur if the filename is not imported properly or it's
											// titled wrong
			System.err.println("Can't open '" + filename + "' for reading."); // this happened a few times when I didnt
																				// import
			System.exit(1); // exit w/ error
		}

		int numRooms = file.nextInt(); // numRooms int set to the next int in the file?
		Room[] rooms = new Room[numRooms]; // Room model, line 5, set as an array, rooms. = number of rooms inside
											// array Room

// initialize rooms from file
		int roomNum = 0; // int roomNum set to 0
		while (file.hasNext()) { // while the file (import ```````````````from txt) has next; e.g. has another TOKEN in the file
			Room r = getRoom(file); // room method set as r; getRoom method is called and pulls file

			if (r.roomNumber != roomNum) { // if the roomNumber in Room method != 0;
				System.err.print("Just read room # " + r.roomNumber); // print + print roomNumber in array
				System.err.println(", but " + roomNum + " was expected."); // print + print roomNum
				System.exit(2); //
			}
			rooms[roomNum] = r; // roomNum in array of rooms is set to r
			roomNum++; // increment the roomNum value
		}
		file.close(); // close the scanner
		return rooms; // return meaning?
	}

	// parameters
	public static void showAllRooms(Room[] rooms) { // new function/method showAllRooms, how do you define the
													// parameters inside the method (Room[] rooms)
		for (Room r : rooms) { // for each rooms inside array Room
			String exitString = ""; // define exitString as a string
			for (int i = 0; i < r.numExits; i++) // for when 0 < number of exits in array of rooms, increment
				exitString += "\t" + r.exits[i] + " (" + r.destinations[i] + ")";
//translation: exitString("") += tab + array of exits in room method + "(" + array of destinations in room method + ")" // i think i did that right tbh
			System.out.println(r.roomNumber + ") " + r.roomName); // r.roomNumber is how you call the roomNumber from
																	// line 60 whileloop
			System.out.println(exitString); // print line 77
		}
	}

	public static Room getRoom(Scanner f) { // last method getRoom // Scanner f assigns f as a scanner, why?
		// any rooms left in the file?
		if (!f.hasNextInt()) // ! returns true if the conditions mentioned are false? // if f does not have a
								// next int, this is false?
			return null; // return error // elaborate returns from line 72

		Room r = new Room(); // Room method line 5 set to r
		String line; // line set as a string

		// read in the room # for error-checking later
		r.roomNumber = f.nextInt(); //
		f.nextLine(); // skip "\n" after room #

		r.roomName = f.nextLine(); // roomName from line 81 = nextLine in scanner?

		// read in the room's description
		r.description = ""; // print description of room from Room method line 5
		while (true) { // while loop contents are true ?
			line = f.nextLine(); // line string = nextLine in scanner
			if (line.equals("%%")) // if line in scanner equals &&
				break; // break
			r.description += line + "\n"; // print the description of the room array + line?
		}

		// finally, we'll read in the exits
		int i = 0; // i = 0;
		while (true) { // while loop contents are true ?
			line = f.nextLine(); // line (string from 101) = nextLine from f (scanner)
			if (line.equals("%%")) // if line (in text file) = &&
				break; // break the loop
			String[] parts = line.split(":"); // create parts array, split the line using : ?
			r.exits[i] = parts[0]; // array of exits = 0 value in parts array?
			r.destinations[i] = Integer.parseInt(parts[1]); // array of destinations = parse parts array
			i++; // increment or continue? e.g. Line 74

		}
		r.numExits = i; // number of exits in method room = i;

		// should be done; return the Room
		return r; //
	}
}
/*
 * Questions: Syntax Line 34 in for loop; Line 49 Try & Catch in the new method;
 * Line 52 exit(1)? Line 55 creating new int and setting it to what?; Line 56
 * Confirm logic; Line 66 exit(2)? Line 69 does this mean reiterate the entire
 * loop? Line 72 does return have different meanings? Line 81 -- confirm that's
 * what that means e.g. using r.roomNumber calls the current roomNumber var from
 * the room method Line 86 - what does assigning f as a scanner mean? Line 88+89
 * -- complete walkthrough
 * 
 * 
 */