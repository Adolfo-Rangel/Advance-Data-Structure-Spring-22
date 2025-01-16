package com.mycompany.heapimpl;

public class Heap {
    Node[] heap;
    int numOfItems;
    
    public Heap(int size){
        heap = new Node[size];
    }
    public Node remove(){
        Node root = heap[0];
        heap[0] = heap[numOfItems -1];
        numOfItems--;
        trickleDown(0);
        return root;
    }
    public void trickleDown(int index){
        int largerChild;
        
        Node temp = heap[index];
        while(index < numOfItems/2){
            int LC = 2*index +1;
            int RC = 2 * index + 2;
            
            if(heap[LC].data < heap[RC].data)
                largerChild = RC;
            else
                largerChild = LC;
            if(temp.data > heap[largerChild].data)
                break;
            heap[index] = heap[largerChild];
            index = largerChild;
        }
        heap[index] = temp;
    }
    public void insert(Node n){
        heap[numOfItems] = n;
        numOfItems++;
        trickleUp(numOfItems-1);
    }
    public void trickleUp(int index){
        Node temp = heap[index];
        int parent = (index -1)/2;
        while(index > 0 && temp.data > heap[parent].data){
            
            
               heap[index] = heap[parent];
            
            index = parent;
            parent = (index - 1)/2; 
            
                
        }
        heap[index] = temp;
    }
    public void change(int index, int value){
        if(index < 0 || index >= numOfItems)
            System.out.println("cannot change");
        int oldValue = heap[index].data;
        heap[index].data = value;
        if(oldValue > value)
            trickleDown(index);
        else
            trickleUp(index);
    }
    
    public void display(){
        for(int i = 0 ;i < numOfItems; i++){
            System.out.println(heap[i].data);
        }
    }
}
