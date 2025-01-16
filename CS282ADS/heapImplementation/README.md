# Heap Implementation in Java

## **Overview**
A **Heap** is a specialized tree-based data structure that satisfies the **Heap Property**:
- **Max-Heap**: The key at the root is greater than or equal to all its children.
- **Min-Heap**: The key at the root is less than or equal to all its children.

Heaps are commonly implemented using arrays and are widely used for priority queues and efficient sorting algorithms like **Heap Sort**.

---

## **Key Characteristics**
1. **Complete Binary Tree**:
   - A heap is always a complete binary tree, meaning all levels are fully filled except possibly the last level, which is filled from left to right.

2. **Heap Property**:
   - In a Max-Heap, the parent node is always greater than or equal to its children.
   - In a Min-Heap, the parent node is always less than or equal to its children.

3. **Array Representation**:
   - The tree is stored in a **1-indexed array** (or **0-indexed**) for efficient access.
   - Parent and child relationships:
     - Parent: \( \text{index} = \lfloor (i - 1) / 2 \rfloor \)
     - Left Child: \( 2i + 1 \)
     - Right Child: \( 2i + 2 \)

---

## **Heap Operations**
1. **Insert**:
   - Add the new element at the end of the array.
   - "Heapify up" by comparing the new element with its parent and swapping if necessary.

2. **Delete (Extract Max/Min)**:
   - Remove the root (max/min value).
   - Replace the root with the last element.
   - "Heapify down" by comparing the root with its children and swapping with the larger (Max-Heap) or smaller (Min-Heap) child.

3. **Heapify**:
   - A utility function to maintain the heap property by recursively adjusting the heap structure.

---

Applications of Heaps

Priority Queues: Efficiently manage dynamic data priorities.

Heap Sort: Sorting algorithm with  O(nlogn) time complexity.

Graph Algorithms: Dijkstra's shortest path, Prim's minimum spanning tree.

Scheduling: Task scheduling with priorities.
Advantages

Efficient insertion and extraction operations:O(logn).

Array-based representation minimizes memory overhead.

Disadvantages

Maintaining heap properties requires additional computation during insert and delete operations.
Not suitable for frequent random access of elements.

Conclusion

The heap is a powerful data structure with diverse applications, particularly in priority-based systems and efficient sorting algorithms. Understanding its implementation provides insight into how data can be dynamically prioritized and organized.
