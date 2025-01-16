package com.codewithadolfo;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = {3,5,2,7,9,6};
        inputArray = 6;

        int[] insertionSort(int[] inputArray);
        System.out.println("Sorted: ");
        for(i=0; i<inputArray; i++) {
            System.out.println(int[] arr + " ");
            System.out.println();
        }


        }





        public int[] insertionSort(int[] inputArray) {
            for(i = 1; i<inputArray.length; i++) {
                int currentValue = inputArray[i];

                int j = i-1;
                while(j >= 0  && inputArray[j] > currentValue) {
                    inputArray[j+1] = inputArray[j];
                    j--;
                }
                inputArray[j+1] = currentValue;
            }
        }

    }
