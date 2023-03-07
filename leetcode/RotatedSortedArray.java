package leetcode;
/*
https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 */
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2};
        int target=3;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr, int target) {
        int pivot= searchpivot(arr);
        //if you did not find a pivot, it means the array is  not rotated
        if (pivot==-1){
            //just do normal binary search
            return binearysearch(arr,target,0, arr.length-1);
        }
        //if we found pivot then we have 2 ascending array
        if (arr[pivot]==target){
            return pivot;
        }
        if (target>=arr[0]){
            return binearysearch(arr,target,0,pivot-1);
        }
        return binearysearch(arr,target,pivot+1,arr.length-1);
    }
    public static int binearysearch(int []arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int searchpivot(int[]arr) {
        int start=0;
        int end= arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(mid>start&&arr[mid]<arr[mid-1]){
            return mid-1;}
            if(mid<end&&arr[mid]>arr[mid+1])
            {return mid;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        return -1;
    }
    // use this when arr contains duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}



/*
   //linear search method
    public static int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
*/