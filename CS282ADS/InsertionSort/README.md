Insertion Sort in Java is a simple sorting algorithm that builds the final sorted array one element at a time by repeatedly picking the next element and inserting it into its correct position in the sorted portion of the array.

How It Works
Starts with the second element, assuming the first element is already sorted.
Compares the current element with elements in the sorted portion.
Shifts elements to the right to make space and inserts the current element in its correct position.

Key Points
Time Complexity:
Best case: O(n) (already sorted array).
Worst case: O(n²) (reversely sorted array).
Space Complexity: O(1) (in-place sorting).
Use Case: Works well for small or partially sorted datasets.
