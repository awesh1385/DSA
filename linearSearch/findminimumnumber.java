package linearSearch;

public class findminimumnumber {
    public static void main(String[] args) {
        int []arr={18,12,45,7,45,2,9,91};
        System.out.println(min(arr));
    }
    public static int min(int[]arr){
        //consider the length of array is !=0
        int ans=arr[0];
        for (int i=1;i<arr.length;i++){
            if(ans>arr[i]){
                ans=arr[i];
            }

        }
        return ans;
    }
}
