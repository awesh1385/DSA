package leetcode;

import java.util.ArrayList;
import java.util.List;

import static InsertionSort.Main.swap;

/*
https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
public class FINDALLDUPLICATESINARRAY {
    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer>list=new ArrayList<Integer>();
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
            }
        for (int index=0;index< arr.length;index++){
            if(arr[index]!=index+1){
                list.add(arr[index]);
            }
        }
        return list;
    }
    static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
