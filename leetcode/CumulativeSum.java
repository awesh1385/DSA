package leetcode;
/*
https://workat.tech/problem-solving/practice/cumulative-sum
 */

import java.util.Arrays;

public class CumulativeSum {
    public static void main(String[] args) {
        int []arr={1, -2, 3, 4, -6};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(getCumulativeSum(arr)));
    }
   static int[] getCumulativeSum (int[] arr) {
        int []cum=new int [arr.length];
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans+arr[i];
            if(ans>0){
                cum[i]=ans;
           }
        }
        return cum;
    }
}
