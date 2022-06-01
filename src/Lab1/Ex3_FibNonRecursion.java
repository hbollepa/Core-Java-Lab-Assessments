package Lab1;

import java.util.Scanner;

// Write a program on Fibonacci by using Non-Recursion function

public class Ex3_FibNonRecursion {
	// main method
	public static void main(String[] args) {
		int n, i, n1 = 1, n2 = 1, n3;
		Scanner s = new Scanner(System.in); // object
		System.out.println("Enter the nth value of Fibonacci sequence :"); // it shows the ouput
		n = s.nextInt(); // Read a int value
		// by using if else statement
		if (n == 1) {
			System.out.println(n1);
			if (n == 2) {
				System.out.println(n2);
			}
		} else
			System.out.println(n1 + " " + n2);

		// here, we are using for loop

		for (i = 2; i < n; ++i) {
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
