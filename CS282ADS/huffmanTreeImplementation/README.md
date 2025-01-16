Why Use PriorityQueue for Huffman Tree?
The Huffman algorithm requires repeatedly finding and removing the two nodes with the smallest frequencies.
A PriorityQueue in Java provides an efficient way to achieve this, as it automatically maintains its elements in ascending order of priority (natural order or a custom comparator).

Basic Steps to Implement Huffman Tree
1. Use a PriorityQueue to store the nodes (characters and their frequencies).
   
2. Extract the two nodes with the smallest frequencies, combine them into a new node, and reinsert the new node into the queue.

3. Repeat until only one node (the root of the tree) remains.
   
Key Points

PriorityQueue:

Efficiently manages nodes in ascending order of frequency.

Automatically reorders after each insertion/removal.

HuffmanNode Class:

Implements Comparable to allow the PriorityQueue to compare nodes by frequency.

Efficiency:

Insertion/removal in a PriorityQueue takes 

O(logn), making it suitable for this algorithm.

Your approach is correct if you're using a PriorityQueue. Ensure your Node class is properly comparable by implementing the Comparable interface or providing a custom comparator.
