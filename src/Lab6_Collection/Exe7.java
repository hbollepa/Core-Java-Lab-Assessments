package Lab6_Collection;

import java.util.Arrays;
import java.util.Collections;

public class Exe7 {
	// Reversing Array
	// Function Reverse the elements of array

	static void reverse(Integer a[]) {
		// create a list of elements in reverse order

		Collections.reverse(Arrays.asList(a));
		// print all the elements
		System.out.println(Arrays.asList(a));
	}

	public static void main(String[] args) {
		// Given array list
		Integer[] arr = { 10, 20, 30, 40, 50 };
		reverse(arr);
	}

}
