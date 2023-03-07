package leetcode;

import java.util.Arrays;

/*
https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[]nums={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
    public static int[] sortedSquares(int[] nums) {

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Selectionsort(nums);
        return nums;
    }

    public static void Selectionsort(int[]nums){
        for(int i=0;i<nums.length;i++){
            int last=nums.length-i-1;
            int max=Maxvalue(nums,0,last);
            swap(nums,max,last);
        }

    }
    public static int Maxvalue(int[]nums,int start,int last){
        int max=0;
        for(int i=start;i<=last;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
