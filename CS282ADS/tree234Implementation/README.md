# 2-3-4 Tree in Java

## **Overview**
A **2-3-4 Tree** is a self-balancing search tree where nodes can contain multiple keys (2, 3, or 4 keys) and have between 2 to 4 children. It is an extension of a Binary Search Tree (BST) and guarantees that the tree remains balanced.

---

## **Key Characteristics**
1. **Node Types**:
   - **2-node**: 1 key, 2 children.
   - **3-node**: 2 keys, 3 children.
   - **4-node**: 3 keys, 4 children.

2. **Properties**:
   - Keys in each node are stored in sorted order.
   - Left subtree < smallest key, middle keys in range, right subtree > largest key.
   - All leaf nodes are at the same depth.

3. **Operations**:
   - **Search**: Efficient lookup by traversing nodes and subtrees.
   - **Insert**: Add keys while splitting 4-nodes as needed.
   - **Delete**: Remove keys with rebalancing via merging or borrowing.

---

## **Advantages**
- Always balanced for predictable performance.
- Efficient operations with \(O(\log n)\) time complexity for search, insert, and delete.

---

## **Java Implementation Outline**
### **Node Structure**
Each node stores:
- An array of keys (`int[] keys`).
- An array of child pointers (`Node[] children`).

### **Basic Methods**
- **Search**:
  Recursively find a key by comparing it to the node’s keys and traversing the correct subtree.
- **Insert**:
  Add a key to the correct position, splitting 4-nodes and rebalancing the tree.

---

## **Example Use Case**
```java
Tree234 tree = new Tree234();
tree.insert(10);
tree.insert(20);
tree.insert(30);
System.out.println(tree.search(20)); // Output: true
System.out.println(tree.search(40)); // Output: false
