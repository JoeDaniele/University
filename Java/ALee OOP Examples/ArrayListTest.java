package aLee2;

import java.util.Arrays;
import java.util.Stack;

public class ArrayListTest {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		s.add(4);
		s.add(7);
		s.add(1);

		System.out.println(s.pop()); // removes 1
		System.out.println(s.pop()); // removes 7
		System.out.println(s.pop()); // removes 4

		arrayTest();
	}

	public static void arrayTest() {
		System.out.println("memes");

		int[] array1 = { 1, 3, 5 };
		System.out.println(Arrays.toString(array1));

		int[] array2 = { 5, 7, 9 };
		System.out.println(Arrays.toString(array2));

	}
}
