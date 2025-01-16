package com.mycompany.hashtablesimpl;

public class SortedLinkedList {
    Node head;
    
    public SortedLinkedList(){
        head = null;
    }
    public void insert(Student s){
        Node curr = head;
        Node prev = null;
        Node newNode = new Node(s);
        while(curr != null && curr.record.id < s.id){
            prev = curr;
            curr = curr.next;
        }
        if(prev == null){
            newNode.next = head;
            head = newNode;
        }
        else{
            newNode.next = curr;
            prev.next = newNode;
        }
        
    }
    public Student delete(int id){
        Node curr= head;
        Node prev = null;
        while(curr != null && curr.record.id <= id){
            prev = curr;
            curr = curr.next;
        }
        Student temp = curr.record;
        if(prev == null){
            head = head.next;
        }
       else{
            prev.next = curr.next;
        }
        return temp;
    }
    public Node search(int id){
        Node curr = head;
        while(curr != null && curr.record.id <= id){
            curr = curr.next;
        }
        if(curr.record.id == id)
            return curr;
        else 
            return null;
    }
    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.record+ "->");
            curr = curr.next;
        }
    }
}
