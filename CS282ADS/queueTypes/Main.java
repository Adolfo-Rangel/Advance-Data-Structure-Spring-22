package com.mycompany.queues;

public class Main {
    public static void main(String[] args) {
        Deque deque = new Deque(2);
        Stack stack = new Stack(2);

        System.out.println("Deque elements ");
        deque.insertRight(23);
        deque.insertLeft(23);
        deque.deleteRight();
        deque.deleteLeft();
        deque.display();
        System.out.println(deque.isEmpty());
        System.out.println(deque.isFull());

        System.out.println("\nStack elements");

        stack.push(32);
        stack.push(25);
        stack.pop();
        stack.push(67);
        stack.peek();
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());


    }
}
