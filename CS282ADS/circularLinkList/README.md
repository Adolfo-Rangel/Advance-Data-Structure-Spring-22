# Circular Linked List in Java

## **Overview**
A **Circular Linked List** is a variation of a linked list where the last node points back to the first node, forming a circle. Unlike a singly or doubly linked list, it does not have a null reference at the end.

---

## **Key Characteristics**
- **Last Node Links to First Node**:
  The `next` pointer of the last node points to the head of the list, creating a circular structure.
  
- **Traversal**:
  Starting from any node, you can traverse the entire list as it forms a cycle.

- **Dynamic Size**:
  Like other linked lists, it can grow or shrink dynamically, as elements are added or removed.

---

## **Structure**
Each node in the list contains:
- **Data**: The value stored in the node.
- **Next Pointer**: A reference to the next node in the list.
