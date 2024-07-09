package basics.patternsQuestion;

import java.util.Iterator;
import java.util.Scanner;

/*
 for n=6 the pattern is below 
 * 
 * 
 * 
 * 
 * 
 * 
 
 for n=3
 *
 *
 *
 
 
 */

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("*");
		}
	}
}
