package com.mycompany.hashtablesimpl;

public class LinearProbingHashtable {
    Student[] list;
    int numOfItems;
    final int SIZE = 11;
    
    public LinearProbingHashtable(){
        list = new Student[SIZE];
    }
    
    public int hash(int key){
        return key%SIZE;
    }
    public void insert(Student s){
        int index = hash(s.id);
        
        while(list[index] != null){
            index++;
            index = index % SIZE;
        }
        list[index] = s;
        numOfItems++;
    }
    public Student delete(int id){
        int index = hash(id);
        
        while(list[index] != null){
            if(list[index].id == id){
                Student temp = list[index];
                list[index] = null;
                numOfItems--;
                return temp;
            }
            index++;
            index = index %SIZE;
        }
        
        return null;
    }
    public Student search(int id){
        int index = hash(id);
        while(list[index] != null){
            if(list[index].id == id){
                return list[index];
            }
            index++;
            index = index %SIZE;
        }
        return null;
    }
    public void display(){
        for(int i = 0 ; i < SIZE ; i++){
            if(list[i] != null)
                System.out.println(i + " " + list[i]);
        }
        
    }
}
