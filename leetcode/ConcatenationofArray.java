package leetcode;

import java.util.Arrays;

/*
https://leetcode.com/problems/concatenation-of-array/
 */
public class ConcatenationofArray {
    public static void main(String[] args) {
        int []nums={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[]arr=new int[nums.length*2];
        int count=0;
        for (int i=0;i< arr.length;i++){
            if(count>=nums.length){
                count=0;
            }
            arr[i]=nums[count];
            count++;
        }
        return arr;
    }
}
