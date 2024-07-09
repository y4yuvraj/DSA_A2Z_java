package basics.patternsQuestion;

import java.util.Scanner;

/*
 
Example 1:
Input: N = 3
Output: 
* * *
* * *
* * *

Example 2:
Input: N = 6
Output:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *

 */

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
