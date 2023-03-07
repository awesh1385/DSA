package leetcode;
/*
https://leetcode.com/problems/shuffle-the-array/description/
 */

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[]nums={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
    //i is our first pointer to iterate till n index
    int i=0;
    //j is our second pointer to iterate after n index
    int j=n;

    int []arr=new int[2*n];//new array of size nums

    int k=0;//this will iterate on our arr.
        while(i<n && j< nums.length){
            arr[k++]=nums[i++];
            arr[k++]=nums[j++];
        }
        return arr;
    }
}
