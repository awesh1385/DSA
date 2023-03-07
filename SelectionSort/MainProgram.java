package SelectionSort;

import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        int []arr={16,1,0,9,100};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxindex=maxvalue(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    static int maxvalue(int []arr,int start,int last){
        int max=0;
        for (int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int []arr,int start,int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
