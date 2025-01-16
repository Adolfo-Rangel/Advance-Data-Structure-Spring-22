Binary Search in Java is an efficient algorithm used to find the position of a target element in a sorted array. It works by repeatedly dividing the search interval in half, comparing the target with the middle element of the array.
How Binary Search Works

Start with the entire array.

Compare the target value with the middle element:

If the target is equal to the middle element, the search is successful.

If the target is smaller than the middle element, search the left half.

If the target is greater, search the right half.

Repeat the process until the target is found or the interval is empty.

Key Conditions

The array must be sorted for binary search to work.

Time complexity: 

Best case:O(1)

Worst case: 𝑂(log𝑛)
