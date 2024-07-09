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

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
