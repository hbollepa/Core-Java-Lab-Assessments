package Lab3_StringsAndParsing;

public class Ex4_Consecute {
// Utility method to get sum of digits of K
	static int sumOfDigit(int K) {
		// Loop util K is not zero
		int sod = 0;
		while (K != 0) {
			sod += K % 10;
			K /= 10;
		}
		return sod;
	}

	// Method returns count of numbs smaller than N
	// satsfying diff condition
	static int totalNumbersWithSpecificDifference(int N, int diff) {
		int low = 1, high = N;

		// Binary search while loop
		while (low <= high) {
			int mid = (low + high) / 2;

			/*
			 * if diff between numb and its sum of digit is smaller than given diff
			 * then,smallest numb will be on left side
			 */
			if (mid - sumOfDigit(mid) < diff)
				low = mid + 1;

			/*
			 * if diff between numb and its sum of digit is greater than or equal to given
			 * diff then,smallest numbr will be on right side
			 */
			else
				high = mid - 1;
		}
// return the diff between smallest nmbr 
// found and 'N' as result
		return (N - high);
	}

// Driver Method
	public static void main(String[] args) {
		int N = 13;
		int diff = 2;

		System.out.println(totalNumbersWithSpecificDifference(N, diff));
	}
}
