/*
 
Input Format: N = 3
Result: 
    * 
  * * 
* * *

Input Format: N = 6
Result:
          * 
        * * 
      * * *
    * * * *
  * * * * *
* * * * * *

 */

package basics.patternsQuestion;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  row = 1;
		while (row <= n) {
			int s=n-row;
			int work=1;
			while(s>0)
			{
				System.out.print(" ");
				s--;
			}
			while(work<=row)
			{
				System.out.print("*");
				work++;
			}
			System.out.println();
			row++;
		}
	}
}
