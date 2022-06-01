package Lab6_Collection;

import java.util.HashMap;
import java.util.HashMap;

public class Ex2 {

	// countChar program
	public static void main(String[] args) {

		// take a string value
		String str = "CAPGEMINI";

		// count the charcters which are present in a String
		HashMap<Character, Integer> charCount = new HashMap<>();

		// using for loop
		for (int i = str.length() - 1; i >= 0; i--) {

			// convert the given string into character array
			if (charCount.containsKey(str.charAt(i))) {

				// update the count value in the HashMap
				int count = charCount.get(str.charAt(i));

				// for each character..,we have to verify,if the key already exist or not
				// if exist..,increase the count variable
				charCount.put(str.charAt(i), ++count);
			}

			// else..,add it to the new kwy and provide initial value with count 1
			else {
				charCount.put(str.charAt(i), 1);
			}
		}

		System.out.println(charCount);
	}

}
