package BinearySearch;

public class Prob1 {
    public static void main(String[] args) {
        int []arr={-10,-9,-3,0,1,2,3,4,5,6,45,67,89,98};//sorted array
        int target=67;
        System.out.println(binearysearch(arr,target));
    }
    static int binearysearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]>target){
                end=mid-1;
            }
            else if (target> arr[mid]){
                start=mid+1;
            }
            else{ //ans found
                return mid;
            }
        }
        return -1;
    }
}
