package aLee;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		Bird b = new Bird();
		System.out.println("Enter the size or type of your bird:");
		b.setSize(k.next());
		System.out.println(b.getSize());

	}
}
//CONSTRUCTOR IS A METHOD THAT MAKES YOUR OBJECT

//ENCAPSULATION IS SETTING/GETTING PRIVATE VARIABLES FROM A CLASS