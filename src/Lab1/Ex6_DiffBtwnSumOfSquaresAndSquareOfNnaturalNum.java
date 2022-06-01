package Lab1;

import java.util.Scanner;

public class Ex6_DiffBtwnSumOfSquaresAndSquareOfNnaturalNum {
	static int sum = 0;
	static int square_sum = 0;

	public static int calculateDifference(int n) {
		for (int i = 0; i < n; i++) {
			// System.out.println(i);
			sum = sum + i;
			square_sum = square_sum + i * i;
		}
		return square_sum - sum * sum;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = scan.nextInt();
		System.out.println(calculateDifference(n));
	}

}