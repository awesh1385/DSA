package leetcode;

import java.util.Arrays;

/*
https://workat.tech/problem-solving/practice/merge-sorted-subarrays
{1,3,5,7,9,11,0,4,6,8}
 */
public class MergeSortedSubarrays {
    public static void main(String[] args) {
       int[]arr= {1,3,5,7,9,11,0,4,6,8};
       int endIndex=5;
        merge(arr,endIndex);
    }
    public static void merge (int[] arr, int endIndex) {
       int [] array1=dividearray(arr,endIndex);
       int [] array2=secondhalf(arr,endIndex);
    } 
    static int[] dividearray(int []arr, int mid){
       int [] array2=new int[mid+1];
       for(int i=0;i<mid+1;i++){
           array2[i]=arr[i];
       }
       return array2;
    }
    static int[]secondhalf(int []arr,int endIndex){
        int []array3=new int[arr.length-1-endIndex];
        for(int i=0;i<arr.length-1-endIndex;i++){
            array3[i]=arr[endIndex+1+i];
        }
        return array3;

    }
}
