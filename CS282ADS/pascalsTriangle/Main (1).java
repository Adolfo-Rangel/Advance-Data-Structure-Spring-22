package com.codewithadolfo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of lines");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int spaces = no;
        int number = 1;
        for(int i = 0; i < no; i++) {

            for(int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            number = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); //formula to calculate the next number
            }
            spaces --;
            System.out.println();
        }
    }
}
