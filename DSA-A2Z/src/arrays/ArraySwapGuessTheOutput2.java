package arrays;

public class ArraySwapGuessTheOutput2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		System.out.println(arr1[0]); // 1
		System.out.println(arr1[1]); // 2
		swap(arr1);
		System.out.println(arr1[0]); // 2
		System.out.println(arr1[1]); // 1
	}

	private static void swap(int[] a1) {
		int temp;
		temp = a1[0];
		a1[0] = a1[1];
		a1[1] = temp;
	}
}
