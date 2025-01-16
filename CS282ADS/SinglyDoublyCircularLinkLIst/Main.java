package com.adolfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        list.insertFirst(23);
        list.insertFirst(65);
        list.insertFirst(7);
        list.insertFirst(9);

        list.display();
    }
}
