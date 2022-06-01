package Lab1;

import java.util.Scanner;

// Write a program to show traffic lights 

public class Ex2_Traffic { // class
	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in); // object
		System.out.println("\n1 for Red \n2 for Yellow \n3 for Green"); // print output
		int color = sc.nextInt();
		String message = "";
		switch (color) { // by using switch statement
		case 1:
			message = "Stop";
			break;
		case 2:
			message = "Ready";
			break;
		case 3:
			message = "Go";
			break;
		default:
			message = "Invalid Input";
			break;
		}
		System.out.println(message); // prints the output
	}

}
