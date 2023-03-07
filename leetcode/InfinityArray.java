package leetcode;
/*
https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */
public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[]num,int target){
        int start=0;
        int end=1;
        while(target>num[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(num, target,start ,end);
    }
    static int binarysearch(int []num ,int target,int start ,int end ){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>num[mid]){
                start=mid+1;
            }
            else if(target<num[mid]){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
