package Lab1;

import java.util.Scanner;

public class Ex4_PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Integer Number : ");
		int num = s.nextInt();
		int count;
		System.out.println("\n List of Prime Numbers Upto : " + num + " is as Below : ");
		for (int i = 2; i <= num; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0)
				System.out.println(i);
		}
	}

}
