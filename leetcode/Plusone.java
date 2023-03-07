package leetcode;

import java.util.Arrays;

/*
https://leetcode.com/problems/plus-one/
 */
public class Plusone {
    public static void main(String[] args) {
        int[] arr = {1,2,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i]=0;

        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}