package com.codewithadolfo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rd = new Random();
        int[] numbers = new int[10]; //creates a new array of 5 elements
        //typecasting allows to print the char at some stack that return an integer
        // example (char)(s.pop)


        for(int i = 0; i < numbers.length; i++) { //sets the length of the array of 5 elements
            numbers[i] = rd.nextInt(100);
        }

        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println(" numbers in order");
        printArray(numbers);
    }
    private static void printArray(int[] numbers){
        int numberOfElements = numbers.length;

        for(int i = 0; i < numberOfElements; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
