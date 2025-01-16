package com.mycompany.queues;

public class Stack {
    Deque deque;
    int[] array;
    int numberOfItems;

    public Stack(int size){
        deque= new Deque(size);
    }

    public boolean isEmpty(){return deque.isEmpty();}

    public boolean isFull(){return deque.isFull();}

    public void pop(){
        deque.deleteRight();
    }
    public void push(int item) {
        deque.insertRight(item);
    }
    public void peek() {deque.display();}

}
