package Lab6_Collection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Ex5 {
	// create getSecondSmallest Method
	public int getSecondSmallest(int[] arr) {
		// create arraylist as a list iterator
		List<Integer> intList = new ArrayList<Integer>();
		// using for loop
		for (int i : arr) {
			intList.add(i);
		}
		// sort the list elements
		Collections.sort(intList);
		// return integer value
		return intList.get(1);
	}

	public static void main(String[] args) {
		// create an object
		Ex5 s = new Ex5();
		// given array elements
		int arr[] = { 23, 43, 54, 24, 56, 75, 86, 45, 64, 34 };
		// To find 2nd elements assign array elements 1 by 1
		int i = s.getSecondSmallest(arr);
		// print 2nd smallest elements
		System.out.println(i);
	}

}
