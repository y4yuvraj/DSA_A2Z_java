package basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int num=sc.nextInt();
		int reversedNumber=0;
		while(num%10!=0)
		{
			int rem=num%10;
			reversedNumber=reversedNumber*10+rem;
			num=num/10;
			
		}
		System.out.println(reversedNumber);
		
	}

}
