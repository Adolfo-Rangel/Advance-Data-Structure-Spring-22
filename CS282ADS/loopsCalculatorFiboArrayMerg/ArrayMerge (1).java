package com.codewithadolfo;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] arr1 = {32,51,74,24,7};
        int[] arr2 = {64,27,31,4,32,62};
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];
        mergeSort(arr1, arr2, result, n1, n2);

        for(int i = 0; i < n1 + n2; i++) {
            System.out.print(result[i] + " ");
        }

    }

    static void mergeSort(int[] arr1, int[] arr2, int[] result, int n1, int n2) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1) {
            result[k] = arr1[i];
            k++;
            i++;
        }
        while(j < n2) {
            result[k] = arr2[j];
            k++;
            j++;
        }
        //bubble sort method
        for(int a = 0; a < n1 + n2 -1; a++) { //this is the getting the length of both arrays for a then b
            for(int b = 0; b < n1 + n2 - 1; b++) {
                if (result[b] > result[b + 1]) { //if this is greater than the next available element, we swap
                    int temp = result[b];
                    result[b] = result[b + 1];
                    result[b + 1] = temp;
                }
            }
        }
    }

    public class OrderedList {
        private int[] array;
        private int numOfElements;

        public OrderedList(int size) {
            array = new int[size];
            numOfElements = 0;
        }
        public boolean isEmpty(){
            return numOfElements == 0;
        }
        public boolean isFull(){
            return numOfElements == array.length;
        }
        public void display(){
            for(int i = 0 ; i < numOfElements; i++){
                System.out.print(array[i] + " ");
            }
        }
        public int search(int item){
            int low =  0;
            int high = numOfElements -1;


            while(high >= low){
                int mid = (low + high)/2;
                if(array[mid] == item)
                    return mid;
                else if(item < array[mid])
                    high = mid - 1;
                else
                    low = mid + 1;

            }
            return -low ;
        }
        public void insert(int value){
            int index = -search(value);
            System.out.println(index);

            for(int i = numOfElements; i >= index ; i--){
                if(i == 0)
                    continue;
                array[i] = array[i-1];
            }
            array[index] = value;
            numOfElements++;
        }
        public boolean delete(int value) {
            if(isEmpty()){
                return false;
            }
            else{
                int index = search(value);
                if (index < 0) {
                    return false;
                } else {
                    for (int i = index; i < numOfElements; i++) {
                        array[i] = array[i + 1];
                    }
                }
                numOfElements--;
                return true;
            }

        }
    }

}

