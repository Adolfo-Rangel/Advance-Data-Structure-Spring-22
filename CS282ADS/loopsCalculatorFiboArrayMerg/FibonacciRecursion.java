package com.codewithadolfo;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }
    static int fibo(int n){
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

}
