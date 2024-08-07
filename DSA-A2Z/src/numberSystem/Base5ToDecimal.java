package numberSystem;

import java.util.Scanner;

public class Base5ToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value in base 5");
		int n=sc.nextInt();
		System.out.println("converting to base 10");
//		1423
		int rem=0;
		int pow=1;
		int ans=0;

		while(n!=0)
		{
			rem=n%10;
			ans=ans+rem*pow;
			n=n/10;
			pow=pow*5;
		}
		System.out.println(ans);
	}
}
