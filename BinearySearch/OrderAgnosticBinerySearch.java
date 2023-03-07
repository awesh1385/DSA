package BinearySearch;

public class OrderAgnosticBinerySearch {
    public static void main(String[] args) {
        //int[] arr ={10,20,30,40,50,60,70,80,90,100};//ascending order
        int[] arr={100,90,80,70,60,50,40,20,10};
        int target=80;
        System.out.println(OAGS(arr,target));
    }

    static int OAGS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean Acen= arr[start]<arr[end];//checking arr is in acending or desending order will return true or false
        while(start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (Acen)   //this will work if array is ascending
            {
                if (target>arr[mid]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            else {  //this will work if array is descending
                if (target>arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
