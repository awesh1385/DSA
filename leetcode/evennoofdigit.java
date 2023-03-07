package leetcode;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class evennoofdigit {
    public static void main(String[] args) {
      int [] nums = {12,345,2,6,7896};
        System.out.println(findnumber(nums));
    }

    //function to count digit
    static int findnumber(int []nums){
        int count=0;
        for (int num:nums){
          if (even(num)){
              count++;
          }
      }
        return count;
    }


//functions to check wheather the a digit is even or not
    static boolean even(int num) {
        int noofdigit=digits(num);
                        /*if (noofdigit%2==0){
                            return true;
                                        }*/
        return noofdigit%2==0;  //if this statement is true return true or return false
    }

    static int digits(int num){
        if (num<0){
            num=num*-1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;// num/=10
        }
        return count;
}
}
