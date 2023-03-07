package InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr={5,43,1,32,55};
        System.out.println(Arrays.toString(InsertionSort(arr)));
    }
    public static int[] InsertionSort(int[]arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
