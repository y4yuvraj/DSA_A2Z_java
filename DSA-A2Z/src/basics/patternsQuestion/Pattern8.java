package basics.patternsQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
	List<Integer> singletonList = Collections.singletonList(5);
	List<Integer> list2= new ArrayList<Integer>(List.of(1,2,3,4,5));
	boolean addAll = list2.addAll(singletonList);	
	System.out.println(list2);
//	boolean addAll2 = singletonList.addAll(list2);
	sc.close();
}
}
