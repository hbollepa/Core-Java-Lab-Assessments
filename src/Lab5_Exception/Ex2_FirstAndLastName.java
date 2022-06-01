package Lab5_Exception;

import java.util.Scanner;

public class Ex2_FirstAndLastName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Name :");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name :");
		String lastName = sc.nextLine();

		try {
			if ((firstName.length() == 0) && (lastName.length() == 0))
				throw new InvalidName("invalid character");
			else
				System.out.println("valid name");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
