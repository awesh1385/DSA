package linearSearch;

public class Main {
    public static void main(String[] args) {
int []arr={12,45,67,678,789,7,9980,32,5,6,678,78};
int target=7;
int ans=LinearSearch(arr,target);
        System.out.println(ans);
    }
    static int LinearSearch(int[]arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if (element == target) {
                return i;
            }

        }
        // if target not found then return -1
        return -1;
    }
}
