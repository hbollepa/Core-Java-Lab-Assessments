package Lab2;

public class Ex1_SecondSmallestElement {
	public static void main(String[] args) {

		int[] arr = new int[] { 99, 77, 89, 33, 22, 12, 354, 676, 35 };
		int SecondSmallestElementinArray = getSecondSmallest(arr);

		System.out.println("Second Smallest Element in Array is:" + SecondSmallestElementinArray);

	}

	public static int getSecondSmallest(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[j] = tmp;
				}
			}
		}
		return (arr[arr.length - 2]);
	}
}
