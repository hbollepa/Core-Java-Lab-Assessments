package Lab5_Exception;

import java.util.Scanner;

public class Ex1_validAge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Age : ");
		int age = sc.nextInt();

		try {
			if (age < 15) {
				throw new InvalidAge_Ex1("Enter Age  greater than an 15 : ");
			} else
				System.out.println("Valid Age");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
