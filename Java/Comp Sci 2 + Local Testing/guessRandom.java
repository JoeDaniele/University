package COMSC2;

import java.util.ArrayList;
import java.util.Scanner;

public class guessRandom {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int rando = (int) (Math.random() * 100 + 1);

		System.out.println("Write 4 values ");

		ArrayList<Integer> userArray = new ArrayList<Integer>(4);
		userArray.add(k.nextInt());
		userArray.add(k.nextInt());
		userArray.add(k.nextInt());
		userArray.add(k.nextInt());

		System.out.println("Testing userArray print here: " + userArray);

		for (Integer number : userArray) {
			System.out.println("Number = " + number);

			k.close();
		}
	}
}

//SET THIS UP TO LOOK LIKE THE HW6P2.PY MEME WHERE IT ROLLS RANDOM NUMBERS AND RESUBMIT THAT JAWN