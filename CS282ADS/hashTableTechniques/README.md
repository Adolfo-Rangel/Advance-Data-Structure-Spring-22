Hash Table Techniques in Java
Hash tables are data structures used to store key-value pairs with efficient lookup, insertion, and deletion operations. They use a hash function to map keys to indices in an array. However, hash collisions (when multiple keys hash to the same index) can occur, and several techniques are used to resolve these collisions.

1. Double Hashing
What It Is:

A collision resolution technique in open addressing.
When a collision occurs, a secondary hash function is used to calculate the step size for probing

How It Works:

If h1(key) is the primary hash function, a second function h2(key) determines the probe interval.

Formula for finding the next index:

index=(h1(key)+i×h2(key))%table size

where i is the probe number.

Advantages:

Reduces clustering.
Better distribution of elements.

2. Separate Chaining
What It Is:

A technique where each index in the hash table contains a linked list (or another collection) of entries.
Colliding elements are stored in the linked list at the same index.

How It Works:

Each key is hashed to an index.
If a collision occurs, the new element is added to the linked list at that index.

Advantages:

Handles collisions efficiently.
Allows the hash table to grow dynamically.

3. Sorted Linked List
What It Is:

A variation of separate chaining where the linked list at each index is sorted.
Ensures that searching for a key in the chain is more efficient than a plain linked list.

How It Works:

Elements are inserted in a sorted order in the linked list at the index.
Searching within the list becomes faster due to the ordering.

Advantages:

Faster searches within a chain compared to unsorted lists.

4. Linear Probing What It Is:

A collision resolution technique in open addressing.
If a collision occurs, the algorithm searches sequentially for the next available slot.
How It Works:

Hash index is calculated as:

index=(h1(key)+i)%table size

where i increments linearly until an empty slot is found.

Advantages:

Simple to implement.
Does not require extra memory for linked lists.

Comparison Table

Technique	Collision Resolution	Memory Usage	Performance

Double Hashing	Open addressing	Minimal	Reduces clustering

Separate Chaining	Linked list	Extra memory for lists	Handles collisions well

Sorted Linked List	Linked list (sorted)	Extra memory for lists	Faster search within chain

Linear Probing	Open addressing	Minimal	May cause clustering

Summary

Each technique has its strengths and is suitable for different scenarios:

Use double hashing or linear probing for compact memory usage.
Use separate chaining or sorted linked lists when handling frequent collisions.

Choose the method based on the hash table size, expected load factor, and performance requirements.
