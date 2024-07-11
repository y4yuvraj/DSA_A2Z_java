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

public class Pattern6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int row=1;
	while(row<=n)
	{
		int space=row-1,nos=n-(row-1);
		while(space>0)
		{
			System.out.print(" ");
			space--;
		}
		while(nos>0)
		{
			System.out.print("*");
			nos--;
		}
		System.out.println();
		row++;
	}
}
}
