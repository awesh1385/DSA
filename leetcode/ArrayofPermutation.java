package leetcode;

import java.util.Arrays;

//link
//https://leetcode.com/problems/build-array-from-permutation/

public class ArrayofPermutation {
    public static void main(String[] args) {
        int []nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    static int[] buildArray(int []nums){
        int n= nums.length;
        int []arr=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}
/*
Explanation :-  int []nums = {0,2,1,5,3,4};

        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]

        pehele andar ka nums[0] solve hoga uski value 0 hi hai to 0 aayega then  nums[nums[1]] num of 1 is 2 aur fir hoga nums[2] hoga 1
        so 1 aayega so on....


            = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
            = [0,1,2,4,5,3]
 */