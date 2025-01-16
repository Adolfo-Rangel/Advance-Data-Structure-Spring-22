package com.adolfo;

public class SinglyList {

    private Node head; //java sets head and tail == null by default;
    private Node tail;
    private int size;

    public SinglyList() { //this is saying is when you create an object of SinglyList there will be an empty
        //list with size = 0;
        this.size = 0;
    }

    public void insertFirst(int val){ //has to be void because its not returning anything.
        Node node = new Node(val);
        node.next = head;
        head = node;
        //what if means the first item being added
        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next; //is just a reference var thats going to point to the object we provided
        // Node next is what links it together

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
