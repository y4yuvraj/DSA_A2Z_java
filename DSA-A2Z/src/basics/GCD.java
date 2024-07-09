package basics;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two number");
		int divident=sc.nextInt();
		int divisor=sc.nextInt();
		
		while(divident%divisor!=0)
		{
			int remainder=divident%divisor;
			divident=divisor;
			divisor=remainder;
		}
		System.out.println(divisor+" : is the GCD");
		sc.close();

	}
}
