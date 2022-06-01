package Lab1;

import java.util.*;

// Program on Fobonacci for Recursion type

public class Ex3_FibRecursion {
	public static int nthFibonacci(int input1) { // nthFibonacci method

		// here.., using if,else-if statements
		if (input1 == 1) {
			return 1;
		} else if (input1 == 2) {
			return 1;
		} else if (input1 == 3) {
			return 2;
		} else {
			return nthFibonacci(input1 - 1) + nthFibonacci(input1 - 2);
		}
	}

	// main method
	public static void main(String[] args) {
		int num, result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number :");
		num = s.nextInt();
		result = nthFibonacci(num);
		System.out.println(result); // prints the output
	}
}
