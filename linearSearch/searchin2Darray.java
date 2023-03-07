package linearSearch;

import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
int [][]arr=
        {
            {13,42,53},
            {12,34,45,76},
            {35,67,87,90,67}
        };
int target=45;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(min(arr));
    }
    static int min(int [][]arr){
        int ans=arr[0][0];
        for (int[] row:arr){
            for(int col:row){
                if (col<ans){
                    ans=col;

                }
            }
        }
        return ans;
    }
    static int[] search(int [][]arr, int target){

        //we assume that arr will not be empty
        for (int row=0;row<arr.length;row++){
            for (int col=0;col< arr[row].length;col++){
                if (target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
