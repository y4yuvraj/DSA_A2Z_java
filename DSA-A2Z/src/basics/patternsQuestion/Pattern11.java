package basics.patternsQuestion;

import java.util.Scanner;

/*
if N=5

    1
   232
  34543
 4567654
567898765


*/

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1,col=1;
		for(int i=0;i<n;i++)
		{
			int var=i+1;
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<col;j++)
			{
				if(j<col/2)
				{
					System.out.print(var++);
				}
				else
				{
					System.out.print(var--);
				}
			}
			System.out.println();
			col+=2;
			space--;
		}
			
	}

} 	
