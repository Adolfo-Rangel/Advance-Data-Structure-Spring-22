package com.mycompany.hashtablesimpl;

public class DoubleHashing {
    Student[] hashtable;
    int SIZE = 5;
    int numOfItems;
    
    public DoubleHashing(){
        hashtable = new Student[SIZE];
    }
    public int hash1(int key){
        return key%SIZE;
    }
    public int hash2(int key){
        return 3 - (key % 3);
    }
    public void insert(Student s){
        int index = hash1(s.id);
        int stepSize = hash2(s.id);
        
        while(hashtable[index] != null){
            index = index + stepSize;
            index = index % SIZE;
        }
        hashtable[index] = s;
        numOfItems++;
        double loadFactor = (double)numOfItems/SIZE;
        if(loadFactor >= 0.5)
            rehash();
    }
    public Student delete(int id){
        int index = hash1(id);
        int stepSize = hash2(id);
        
        while(hashtable[index] != null){
            if(hashtable[index].id == id){
                Student temp = hashtable[index];
                hashtable[index] =null;
                numOfItems--;
                return temp;
            }
            index = index + stepSize;
            index = index % SIZE;
        }
        return null;
    }
    public Student search(int id){
        int index = hash1(id);
        int stepSize = hash2(id);
        
        while(hashtable[index] != null){
            if(hashtable[index].id == id){
                return hashtable[index];
            }
            index = index + stepSize;
            index = index % SIZE;
        }
        return null;
    }
    public void display(){
        for(int i = 0 ; i < SIZE ; i++){
            //if(hashtable[i] != null)
                System.out.println(i + " " + hashtable[i]);
        }
        
    }
    private void rehash(){
        //calculate the size
        SIZE = SIZE * 2;
        //find the next prime number
        SIZE = findNextPrime(SIZE);
        //create a new hashtable
        Student[] temp = hashtable;
        hashtable = new Student[SIZE];
        numOfItems = 0;
        //transfer 
        for(int i = 0; i < temp.length; i++){
            if(temp[i] != null)
                insert(temp[i]);
        }
    }
    public int findNextPrime(int newSize){
        for(int i= newSize+1 ; true; i++){
            if(isPrime(i))
                return i;
        }
    }
    public boolean isPrime(int num){
        for(int i = 2; i < num ; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
