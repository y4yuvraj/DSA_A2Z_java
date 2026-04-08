package dsa.basicDS;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr1 = {8,3,1,5,-6,6,2,2};
        int[] arr2 = {1,2,4,5};
        int sum=4;
        System.out.println(longestSubArrayLengthWithGivenSum(arr1,sum));
        System.out.println(longestSubArrayLengthWithGivenSum(arr2,sum));
    }
    public static int longestSubArrayLengthWithGivenSum(int [] arr, int sum)
    {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int prefixSum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            prefixSum=prefixSum+arr[i];
            if (prefixSum == sum) {
                count = i + 1;
            }
            if(hm.containsKey(prefixSum-sum))
            {
                count=Math.max(count,i-hm.get(prefixSum-sum));
            }
            if(!hm.containsKey(prefixSum))
                hm.put(prefixSum,i);
        }
        return count;
    }

}
