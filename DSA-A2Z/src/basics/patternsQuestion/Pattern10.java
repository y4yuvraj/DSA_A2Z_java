package basics.patternsQuestion;
import java.util.Scanner;

/*
if N=5

    *
   *!*
  *!*!*
 *!*!*!*
*!*!*!*!*


*/

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1,num=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++)
			{
				if(j%2==0)
				{
					System.out.print("!");
				}
				else
				{
					System.out.print("*");
				}
			}
			space--;
			num=num+2;
			System.out.println();
		}
	}

}
