Binary Search Tree Based Hash Table

Overview

This project implements a hash table using Binary Search Trees (BSTs) instead of linked lists to handle collisions. Typically, separate chaining in a hash table involves storing collided elements in a linked list at the corresponding index. However, in this implementation, each bucket of the hash table is a BST, allowing for efficient insertion, deletion, and search operations.

Key Concepts

1. Hash Table with BSTs

A hash table is an array where each index contains a Binary Search Tree (BST) instead of a linked list.

The hash function determines the index where an element should be placed.

The BST structure ensures that lookup, insertion, and deletion operations are efficient.

2. Binary Search Tree (BST) Operations

Each BST node contains a data value and pointers to left and right child nodes.

The BST supports basic operations:

Insertion: Inserts elements while maintaining the BST property.

Search: Traverses the tree to locate elements.

Deletion: Deletes elements and restructures the BST if needed.

Traversal: Supports inorder, preorder, and postorder traversals to display the stored values.

3. Hash Table Operations

Insert: Hashes a student record and places it in the correct BST.

Search: Finds a student record by ID using the hashed index.

Delete: Removes a student record by ID while maintaining the BST structure.

Display: Uses inorder traversal to print all stored records.

Implementation Details

Classes Used

1. Node.java

Defines a node for the BST with data, left, and right child references.

2. BST.java

Implements the Binary Search Tree with operations like:

insert(int data): Inserts an integer into the BST.

search(int key): Searches for a node with a given key.

delete(int item): Deletes a node while maintaining the BST property.

inorder(), preorder(), postorder(): Different tree traversals for displaying elements.

3. SeparateChaining.java (Modified to Use BSTs)

Hash Table Implementation:

Stores BSTs at each index instead of linked lists.

hash(int key): Computes the index based on the student ID.

insert(Student s): Inserts a student record into the BST at the computed index.

delete(int id): Deletes a student record using BST deletion.

search(int id): Searches for a student by ID.

display(): Displays the contents of the hash table using inorder traversal.

Constraints

No built-in Java data structures: The implementation avoids using ArrayList, TreeSet, or other Java collections.

BST used for collision handling: Unlike traditional separate chaining, where linked lists store collided elements, BSTs are used to ensure faster lookups.

Student Records as Data: The hash table manages student records, requiring proper ID-based indexing and retrieval.
