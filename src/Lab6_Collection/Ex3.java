package Lab6_Collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex3 {

	// create a method m and retuen HashMap
	public static HashMap m(int[] array) {

		// create a hashMap object
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// taking int n value from array
		for (int n : array) {

			// take n as 1 them n*n as 1*1 that can assign to map
			map.put(n, n * n);
		}

		// now return the map
		return map;
	}

	// create a main method
	public static void main(String[] args) {

		// create an integer object
		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 11 };

		HashMap<Integer, Integer> map = m(array);

		// Here,,by using iterator
		Iterator<Integer> i = map.keySet().iterator();

		while (i.hasNext()) {
			Integer key = i.next();

			System.out.println(key + ":" + map.get(key));
		}
	}

}
