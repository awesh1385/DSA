package leetcode;

import java.util.Arrays;

/*
https://leetcode.com/problems/move-zeroes/
 */
public class MovesZero {
    public static void main(String[] args) {
        int []arr={0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeroes(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
            arr[count++]=arr[i];
}
        }
        while (count<arr.length){
            arr[count++]=0;
        }
    }

}
