package arrays;

public class ArraySwapGuessTheOutput {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		System.out.println(arr1[0]); // 1
		System.out.println(arr2[0]); // 4
		swap(arr1, arr2);
		System.out.println(arr1[0]); // 1
		System.out.println(arr2[0]); // 4
	}

	private static void swap(int[] a1, int[] a2) {
		int[] temp;
		temp = a1;
		a1 = a2;
		a2 = temp;
	}
}
