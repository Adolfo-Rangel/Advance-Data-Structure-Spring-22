package com.mycompany.bstimpl;

public class BSTImpl {

    public static void main(String[] args) {
        BST b = new BST();
        b.insert(50);
        b.insert(30);
        b.insert(70);
        b.insert(65);
        b.insert(63);
        b.insert(75);
        b.insert(73);
        b.insert(72);
        b.delete(70);
        b.inorder();
    }
}
