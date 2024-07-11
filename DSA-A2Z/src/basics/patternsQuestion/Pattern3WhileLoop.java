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

public class Pattern3WhileLoop {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int row=1,nos=1;
		while(row<=num)
		{
			int countOfStar=1;
			while(nos>=countOfStar)
			{
				System.out.print("* ");
				countOfStar++;
			}
			System.out.println();
			row++;
			nos++;
		}
		sc.close();
	}
}
