package com.mycompany.queues;

public class Deque {
    private int[] array;
    private int front; //front
    private int rear; //rear
    private int numberOfItems; //size

    public Deque(int size) {
        array = new int[size];
        front = -1;
        rear = -1;
        numberOfItems = 0;
    }

    public boolean isEmpty(){return numberOfItems == 0;}

    public boolean isFull(){return numberOfItems == array.length;}

    //insertLeft() = addFirst() = insertFront() <--
    public void insertLeft(int item) {
        if(!isFull()){
            if(front == -1) {
                front = 0; rear = 0;
            }
            else if(front == 0) {
                front = array.length -1;
            }
            else{
                front--;
            }
            array[front] = item;
            numberOfItems++;
        }
        else{
            System.out.println("Cannot insert");
        }
    }
    //Rear -->
    public void insertRight(int item) {
        if(!isFull()){
            if(front == -1) {
                front = 0; rear = 0;
            }
            else if(rear == array.length -1) {
                rear = 0;
            }
            else {
                rear++;
            }
            array[rear] = item;
            numberOfItems++;
        }
        else{
            System.out.println("Cannot insert");
        }
    }
    //<-- front
    public void deleteLeft(){
        if(!isEmpty()) {
            if (front == rear){
                front = -1; rear = -1;
            }
            else if(front == array.length - 1) {
                front =0;
            }
            else {
                front = front + 1;
            }
            numberOfItems--;
        }
        else {
            System.out.println("Cannot delete");
        }
    }
    //--> rear
    public void deleteRight(){
        if(!isEmpty()) {
            if (front == rear){
                front = -1; rear = -1;
            }
            else if(rear == 0) {
                rear = array.length -1;
            }
            else {
                rear = rear - 1;
            }
            numberOfItems--;
        }
        else {
            System.out.println("Cannot delete");
        }
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        while(i != rear) {
            System.out.print(array[i] + " ");
            i =(i + 1) % array.length;
        }
        System.out.print(array[rear]);
        System.out.println();
    }
}
