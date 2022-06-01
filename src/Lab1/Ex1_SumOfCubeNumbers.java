package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Writw a program on Sum of Cube Numbers

public class Ex1_SumOfCubeNumbers { // class

	public static void main(String[] args) { // main method
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // object creation
		int n = 9; // declare a variable and intialisation
		System.out.println(n);
		// Try block allows to define a block of code to be tested for Errors,while it
		// is being executed
		try {
			n = Integer.parseInt(br.readLine());
		}
		// Catch statement allows to define a block of code to be executed,,if an error
		// occurs in the try block
		catch (Exception e) {
			System.out.println("An Error Occured");
			return;
		}
		// if is a conditional statement: to specify a block of code to be executed.,,if
		// a specified condition is true
		if (n < 0) {
			System.out.println("n cannot take Negative values");
			return;
		}
		double sum = Math.pow(n * (n + 1) / 2, 2);
		System.out.println("The Sum of First " + n + " Cube Number is : " + sum); // print the sum of cubes numbers
	}
}
