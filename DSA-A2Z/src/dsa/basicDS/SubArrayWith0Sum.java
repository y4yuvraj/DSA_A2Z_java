package dsa.basicDS;

import java.util.HashSet;

public class SubArrayWith0Sum {


    public static void main(String[] args) {
        int[] arr1 = {1,4,13,-3,-10,-5}; //yes
        int[] arr2 = {3,1,-2,5,6};//no
        System.out.println(zeroSum(arr1));
        System.out.println(zeroSum(arr2));
    }

    static public boolean zeroSum(int[] arr)
    {
        HashSet<Integer> hashSet=new HashSet<>();
        int prefixSum=0;
        for(int i=0;i< arr.length;i++)
        {
            prefixSum=prefixSum+arr[i];
            if(hashSet.contains(prefixSum))
            {
                return true;
            }
            hashSet.add(prefixSum);
        }
        return false;
    }
}

