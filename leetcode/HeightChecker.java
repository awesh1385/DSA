package leetcode;
import java.util.Arrays;


/*
https://leetcode.com/problems/height-checker/
 */
public class HeightChecker {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int[] nums=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        SelectionSort(nums);
        System.out.println(heightchecker(arr,nums));
    }
    static int heightchecker(int []arr,int[]nums){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]!=nums[i]){
                count++;
            }
        }
        return count;
    }
    static void SelectionSort(int []nums){
        for(int i=0;i<nums.length;i++){
            int last= nums.length-i-1;
            int max=MaxValue(nums, last);
            swap(nums,max,last);

        }
    }

     static int MaxValue(int[] nums, int last) {
        int max=0;
        for (int i = 0; i<=last; i++){
            if (nums[i]>nums[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
