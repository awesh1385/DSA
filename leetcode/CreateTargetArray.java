package leetcode;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

/*
https://leetcode.com/problems/create-target-array-in-the-given-order/
 */
public class CreateTargetArray {
    public static void main(String[] args) {
        int []nums={0,1,2,3,4};
        int []index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        //creating arraylist to store the elements 
        ArrayList<Integer> list=new ArrayList<>(nums.length);
        for (int i=0;i<index.length;i++){
        list.add(index[i],nums[i]);}
        //creating new array to we have to return array
        int[]result=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
