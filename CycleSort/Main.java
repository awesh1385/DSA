package CycleSort;

import java.util.Arrays;

import static InsertionSort.Main.swap;

public class Main {
    public static void main(String[] args) {
        int[]arr={1,1,4,2,1,3};
       Cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Cyclesort(int[]arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
}
