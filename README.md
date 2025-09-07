1. Bubble Sort
Repeatedly compare adjacent elements and swap if they are in the wrong order.
Largest element “bubbles” to the end in each pass.
Time Complexity: O(n²)
2. Selection Sort
Repeatedly find the smallest element from the unsorted part and put it at the beginning.
Works by selecting minimum and swapping.
Time Complexity: O(n²)
3. Insertion Sort
Build the sorted array one element at a time.
Take an element and insert it into the correct position in the sorted part.
Time Complexity: O(n²), but O(n) for nearly sorted arrays.
4. Merge Sort
Divide array into halves, recursively sort, and then merge them.
Uses Divide and Conquer strategy.
Time Complexity: O(n log n)
5. Quick Sort
Pick a pivot element, partition array into smaller (left) and larger (right), then sort recursively.
Very fast in practice.
Time Complexity: O(n log n) average, O(n²) worst.
