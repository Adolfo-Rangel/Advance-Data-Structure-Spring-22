package com.codewithadolfo;

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
    public static int[] mergeSort(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length) {
            merged[k] = arr1[i];
            k++;
            i++;
        }
        while(j < arr2.length) {
            merged[k] = arr2[j];
            k++;
            j++;
        }

        //bubble sort method
        for(int a = 0; a < arr1.length + arr2.length -1; a++) { //this is the getting the length of both arrays for a then b
            for(int b = 0; b < arr1.length + arr2.length - 1; b++) {
                if (merged[b] > merged[b + 1]) { //if this is greater than the next available element, we swap
                    int temp = merged[b];
                    merged[b] = merged[b + 1];
                    merged[b + 1] = temp;
                }
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {53,72,4,723,3};
        int[] arr2 = {325,43,2,74,9};

        int[] merged = OrderedList.mergeSort(arr1, arr2);

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

    }
}
