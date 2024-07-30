package basics.patternsQuestion;

import java.util.Scanner;

/*
if N=5

*   *
 * *
  *
 * *
*   *

*/


public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int midSpace=n-2;
		int leftSpace=0;
		int nos=2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<leftSpace;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=0;j<midSpace;j++)
			{
				System.out.print(" ");
			}
			if(i!=n/2)
			{
				System.out.print("*");
			}
			if(i<n/2)
			{
				leftSpace++;
				midSpace=midSpace-2;
			}
			else
			{
				leftSpace--;
				midSpace=midSpace+2;
			}
			System.out.println();
		}
	}

}
