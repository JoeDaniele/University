package CompSci2;

import java.util.Scanner;

//Caesar Cipher Technique
public class shiftCipher {
	public static StringBuffer encrypt(String text, int s) {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				char ch = (char) ((text.charAt(i) + s - 65) % 26 + 65);
				result.append(ch);
			} else {
				char ch = (char) ((text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("Enter the message you want translated: ");

		String text = k.nextLine();

		int s = -3;
		System.out.println("Text : " + text);
		System.out.println("Shift : " + s);
		System.out.println("Cipher: " + encrypt(text, s));
		k.close();
	}
}
