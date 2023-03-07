//question link
//https://leetcode.com/problems/two-sum/

package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] num={3,2,4,6,7,3};
        int target=6;
        System.out.println(Arrays.toString(search(num, target)));


    }
    static int[] search(int []num,int target){

       for (int i=0;i<num.length;i++){
           for (int j=i+1;j< num.length;j++){
               if (num[j]==target-num[i]){
                   return new int[]{i,j};
               }
           }
       }

        return null;
    }
}
