package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(findfibonacci(4));
    }
    static int  findfibonacci(int n){
        if(n<2){
            return n;   //if nis 1 return 1 if 0 return 0
        }
        return findfibonacci(n-1) + findfibonacci(n-2);
    }
}
