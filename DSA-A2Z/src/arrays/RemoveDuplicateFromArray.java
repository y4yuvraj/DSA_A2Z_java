package arrays;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 2, 3, 10, 20, 20, 30, 30, 30 };
		int ind = arr.length > 0 ? 1 : 0;
		if (ind == 0) {
			System.out.println(ind);
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				arr[ind] = arr[i];
				ind++;
			}
		}
		for (int i=0;i<ind;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
