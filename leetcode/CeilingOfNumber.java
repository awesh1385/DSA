package leetcode;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(cellingofnumber(arr,target));
    }
    //return smallest number >= target
    static int cellingofnumber(int[]arr,int target){
        //but what if the target no is greater than the gretest num in the array
        if (target>arr.length-1){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]) {
                start=mid+1;
            }
            if(target==arr[mid]){
                return mid;
            }
        }
       return  start;

    }
}
