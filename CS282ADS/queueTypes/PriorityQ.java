/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author juneja_u
 */
public class PriorityQ {
    private int[] array;
    private int front;
    private int rear;
    private int numberOfItems;
    
    public PriorityQ(int size){
        array = new int[size];
        front = 0;
        rear = -1;
        numberOfItems = 0;
    }
    public boolean isEmpty(){
        return numberOfItems == 0;
    }
    
    public boolean isFull(){
        return numberOfItems == array.length;
    }
    public int peek(){
        if(!isEmpty())
            return array[front];
        else
            return -1;
    }
    public int remove(){
        if(!isEmpty()){
            int temp = array[front];
            if(front == array.length -1)
                front = 0;
            else
                front++;
            numberOfItems--;
            return temp;
        }
        else
            return -1;
        
    }
    public void insert(int item){
        if(!isFull()){
            int i;
            for( i = numberOfItems-1; i>=0 ;i--){
                if(array[i] < item)
                    array[i+1] = array[i];
                else
                    break;
            }
            array[i+1] = item;
        }
    }
}
