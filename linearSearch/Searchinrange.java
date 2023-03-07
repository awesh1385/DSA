package linearSearch;

public class Searchinrange {
    public static void main(String[] args) {
        int [] arr={18,17,-7,3,14,28};
        int target=3;

        System.out.println(searchinrange(arr,target,1,4));
    }
    static int searchinrange(int []arr,int target ,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (target == arr[i]) {
                return i;
            }

        }


        return -1;
    }
}
