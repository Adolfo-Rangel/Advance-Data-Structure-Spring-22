package com.mycompany.hashtablesimpl;


public class SeparateChaining {
    SortedLinkedList[] hashtable;
    
    public SeparateChaining(){
        hashtable = new SortedLinkedList[5];
        for(int i = 0 ; i < 5 ; i++)
            hashtable[i] = new SortedLinkedList();
    }
    public int hash(int key){
        return key%5;
    }
    public void insert(Student s){
        int index = hash(s.id);
        hashtable[index].insert(s);
    }
    public void delete(int id){
        int index = hash(id);
        hashtable[index].delete(id);
    }
    public void search(int id){
        int index = hash(id);
        hashtable[index].search(id);
    }
    public void display(){
        for(int i = 0 ; i < 5 ; i++){
            hashtable[i].display();
        }
    }
}
