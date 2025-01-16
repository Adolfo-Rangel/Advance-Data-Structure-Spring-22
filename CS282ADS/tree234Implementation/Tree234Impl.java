package com.mycompany.tree234impl;

public class Tree234Impl {

    public static void main(String[] args) {
        Tree234 t = new Tree234();
        t.insert(87);
        t.insert(1);
        t.insert(23);
        t.insert(65);
        t.insert(74);
        t.insert(8);
        t.insert(35);

        t.root.displayNode();
        System.out.println();
        t.inorderTraversal(t.root);
        System.out.println();
        System.out.println(t.delete(1)); //in tree hence true
        System.out.println(t.delete(11)); //not in tree hence false
        System.out.println(t.delete(8));
        System.out.println(t.delete(65));
        System.out.println(t.delete(100)); //not in tree hence false
    }
}
