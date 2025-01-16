package com.mycompany.heapimpl;

public class HeapImpl {

    public static void main(String[] args) {
        Heap h = new Heap(15);
        h.insert(new Node(40));
        h.insert(new Node(35));
        h.insert(new Node(50));
        
        h.remove();
        h.display();
        
    }
}
