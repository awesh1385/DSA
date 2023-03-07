package leetcode;

import java.util.Arrays;
/*
https://leetcode.com/problems/missing-number/
 */

public class MissingNum {
    public static void main(String[] args) {
        int[]arr={0,1};
        System.out.println(cyclesort(arr));

    }
    public static int cyclesort(int[]arr){

        int i=0;
        while(i< arr.length){
            int correct=arr[i];


            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else
            {
                i++;
            }
        }
        for(int j=0;j< arr.length;j++){
            if(arr[j]!=j){
                return j;
            }

        }
        return arr.length;

    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

/* without cycle sort;
class Solution {
    public int missingNumber(int[] nums) {
        int rangeSum = 0, numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
            rangeSum += i;
        }
        return (rangeSum + nums.length) - numsSum;
    }
}
 */
