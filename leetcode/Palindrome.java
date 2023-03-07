package leetcode;

public class Palindrome {
    public static void main(String[] args) {
        String str="abccba";
        System.out.println(ispalindrome(str));
    }
    static boolean ispalindrome(String str){
        for(int i=0;i<str.length();i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
