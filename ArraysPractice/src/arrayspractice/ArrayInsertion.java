package arrayspractice;

public class ArrayInsertion {

	public static void main(String[] args) {

		int[] arr = new int[7];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int n = 7;

		int pos = 1;
		int ele = 44;

		System.out.println("Array Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		if (pos < 1 || pos > n+1) {
			System.out.println("Element cannot be inserted.Position not valid.");
			return;
		}

		if (n == arr.length) {
			System.out.println("Array is full. No more element can be inserted.");
			return;
		}

		for (int i = n; i >= pos; i--)
			arr[i] = arr[i - 1];

		arr[pos - 1] = ele;
		n++;

		System.out.println("Array After  Insertion");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
