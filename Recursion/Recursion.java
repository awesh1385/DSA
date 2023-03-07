package Recursion;
/*
when function call itself it is called as recursion.
It helps us to solve bigger complex problem in simpler way.

You can convert Recursion function into iteration and vice versa.
Space Complexity is not constant because of calls.
 */
public class Recursion {
    public static void main(String[] args) {
        message(1);
    }
    static void message(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        message(n+1);

    }
}
