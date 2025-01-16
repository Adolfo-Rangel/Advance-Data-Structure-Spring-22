package com.codewithadolfo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //This is lesson is on loops
        //int i = 0;
//        for (int i = 1; i <= 5; i+= 1) {
//            System.out.println(i);
//        }
        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for(int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
//        }
        //while loop syntax
        /*
            while (condition) {
                //body
            {
        */
////        int num = 1;
////        while(num <=5) {
////            System.out.println(num);
////            num+= 1;
//        }

        int n = 1;
        do{
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
