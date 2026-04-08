package dsa.basicDS;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr1 = {5,8,6,13,3,-1}; //yes
        int[] arr2 = {1,2,4,5};//no
        int sum=22;
        System.out.println(subArrayContainsGivenSum(arr1,sum));
        System.out.println(subArrayContainsGivenSum(arr2,sum));
    }
    static boolean subArrayContainsGivenSum(int [] array, int sum)
    {
        HashSet<Integer> ps=new HashSet<>();
        int currentSum =0;
        for(int i=0;i<array.length;i++)
        {
            currentSum=currentSum+array[i];
            if(currentSum==sum || ps.contains(currentSum-sum))
            {
                return true;
            }
            ps.add(currentSum);
        }
        return false;
    }
}

