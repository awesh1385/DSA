package BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int []arr){
        boolean swapped;
        //run the steps N-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for each step of i max item will come at last index

            for(int j=1;j<arr.length;j++){

                //swap if the item is smaller than the previous one
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if you didnt swap for a particular value i, then it means the array is sorted hence stop loop
            if(!swapped){
            //!false=true
                break;
            }
        }
    }
}
