package Lab2;

public class Ex4_RemoveDuplicateEleInArrayAndSortInDesc {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 40, 40, 90 };
		int n = arr.length;
		int length = modifyArray(arr, n);
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static int modifyArray(int arr[], int n) {
		int num = 0;
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}

		// Sort the Array in Descending Order

		for (int i = 0; i < j; i++) {
			for (int k = i + 1; k < j; k++) {
				if (arr[i] < arr[k]) {
					num = arr[i];
					arr[i] = arr[k];
					arr[k] = num;
				}
			}
		}
		return j;
	}

}
