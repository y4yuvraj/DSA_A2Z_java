package basics.patternsQuestion;

import java.util.Scanner;

/*
if N=7

   *
  ***
 *****
*******
 *****
  ***
   *

*/

public class Pattern8 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int space=n/2,nos=1;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<space;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<nos;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		if(i<n/2)
		{
			space--;
			nos=nos+2;
		}
		else
		{
			space++;
			nos=nos-2;
		}
	}
	sc.close();
}
}
