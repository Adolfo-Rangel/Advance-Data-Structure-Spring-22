/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.queues;

/**
 *
 * @author juneja_u
 */
public class Queues {

    public static void main(String[] args) {
        ArrayBasedQueue q = new ArrayBasedQueue(10);
        q.insert(4);
        q.insert(56);
        q.insert(23);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
    }
}
