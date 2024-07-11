/*
 
Input Format: N = 3
Result: 
* * *
* * 
*

Input Format: N = 6
Result:
* * * * * *
* * * * * 
* * * * 
* * * 
* * 
*

*/
package basics.patternsQuestion;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=n,nos=n;
		while(row>0)
		{
			int cos=0;
			while(cos<nos)
			{
				System.out.print("* ");
				cos++;
			}
			System.out.println();
			row--;
			nos--;
		}
		
	}
}
