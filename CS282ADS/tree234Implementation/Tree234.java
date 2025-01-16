package com.mycompany.tree234impl;

public class Tree234 {
    Node root;
    
    public Tree234(){
        root = new Node();
    }
    public int search(int item){
        Node curr = root;
        int index = curr.searchItem(item);
        while(true){
            if(index == -1 && !curr.isLeaf()){
                curr = getNextLevel(curr, item);
                index = curr.searchItem(item);
            }
            else if(index >= 0)
                return index;
            else 
                break;
           
        }
        return -1;
    }

    public void insert(int item){
        Node curr = root;
        
        while(true){
            if(curr.isFull()){
                split(curr);
                curr = curr.getParent();
                curr = getNextLevel(curr,item);
            }
            else if(curr.isLeaf())
                break;
            else
                curr = getNextLevel(curr,item);
                
        }
        curr.insertItem(item);
    }

    public boolean delete (int item){
        Node curr = root;
        int index = curr.searchItem(item);

        while (true) {
            if (index == -1 && !curr.isLeaf()) {
                curr = getNextLevel(curr, item);
                index = curr.searchItem(item);
            } else if (index >= 0) {
                curr.flagDelete(index);
                return true;
            } else {
                break;
            }
        }
        return false;
    }
    public void split(Node n){
      //node is full
      int B, C;
      Node child2, child3, parent;
      
      C = n.removeItem();
      B = n.removeItem();
      
      child3 = n.disconnectChild(3);
      child2 = n.disconnectChild(2);
      
      Node sibling = new Node();
      
      if(n == root){
          root = new Node();
          parent = root;
          parent.connectChild(n, 0);
      }
      else
          parent = n.getParent();
      
      //deal with parent
      int index = parent.insertItem(B);
      int numItems = parent.getNumOfItems();
      
      for(int i = numItems-1; i> index; i--){
          Node temp = parent.disconnectChild(i);
          parent.connectChild(temp, i+1);
      }
      parent.connectChild(sibling, index+1);
      
      //deal with sibling
      sibling.insertItem(C);
      sibling.connectChild(child3, 1);
      sibling.connectChild(child2, 0);
    }
    public Node getNextLevel(Node n, int value){
        int i;
        int numItems = n.getNumOfItems();
        for(i = 0 ; i < numItems ; i++){
            if(value < n.getItem(i))
                return n.getChild(i);
        }
        return n.getChild(i);
    }

    public void inorderTraversal(Node node) {
        if (node != null) {
            if (!node.isLeaf()) {
                inorderTraversal(node.getChild(0));
            }
            for (int i = 0; i < node.getNumOfItems(); i++) {
                    System.out.print(node.getItem(i) + " ");
                    if (!node.isLeaf()) {
                        inorderTraversal(node.getChild(i + 1));
                    }
            }
        }
    }

}
