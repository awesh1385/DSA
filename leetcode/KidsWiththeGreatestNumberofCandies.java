package leetcode;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int []arr={2,3,5,1,3};
        int extracandies=3;
        System.out.println(kids(arr,extracandies));

    }
    public static List<Boolean> kids(int[] candies, int extraCandies){
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            ans.add(candy + extraCandies >= max);
        }
        return ans;
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> List=new ArrayList<Boolean>(candies.length);
        for (int i=0;i<candies.length;i++) {
            boolean check = false;
            //we will use 1 more for loop to compare other kids candies
            for (int j = 0; j < candies.length; j++) {
                if (i==j){
                    continue;
                }
                if (candies[i]+extraCandies>=candies[j]){
                    check=true;
                }
                else{
                    check=false;
                    break;
                }
            }

            List.add(i,check);


        }
        return List;
    }
}
