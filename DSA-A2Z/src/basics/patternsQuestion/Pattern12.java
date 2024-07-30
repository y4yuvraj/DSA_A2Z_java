package basics.patternsQuestion;

import java.util.Scanner;

public class Pattern12 {

/*
if N=10
	
         0
        909
       89098
      7890987
     678909876
    56789098765
   4567890987654
  345678909876543
 23456789098765432
1234567890987654321

*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1, nov = 1;
		for (int i = 0; i < n; i++) {
			int num = n - i;
			for (int j = space; j > 0; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j < nov; j++) {
				if (num == 10) {
					System.out.print(0);
					num--;
				} else if (j > nov / 2) {
					System.out.print(num);
					num--;
				}
				else {
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
			space--;
			nov += 2;
		}
	}

}
