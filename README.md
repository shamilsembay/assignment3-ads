# Sorting and Searching Algorithm Analysis System

## Project Overview

This project compares sorting and searching algorithms using Java.

Selected algorithms:

- Basic Sorting: Bubble Sort
- Advanced Sorting: Merge Sort
- Searching: Binary Search

The purpose of this project is to measure execution time and compare algorithm performance on different array sizes and input types.

## Algorithms

### Bubble Sort

Bubble Sort compares neighboring elements and swaps them if they are in the wrong order.

Time complexity:

- Best case: O(n)
- Average case: O(n²)
- Worst case: O(n²)

Bubble Sort is easy to understand, but it is slow for large arrays.

### Merge Sort

Merge Sort divides the array into smaller parts, sorts them, and merges them back together.

Time complexity:

- Best case: O(n log n)
- Average case: O(n log n)
- Worst case: O(n log n)

Merge Sort is faster than Bubble Sort for large arrays.

### Binary Search

Binary Search works by checking the middle element of a sorted array.

Time complexity:

- Best case: O(1)
- Average case: O(log n)
- Worst case: O(log n)

Binary Search requires the array to be sorted.


## Analysis Questions

### Which sorting algorithm performed faster? Why?

Merge Sort performed faster for large arrays because its time complexity is O(n log n). Bubble Sort is slower because it has O(n²) complexity.

### How does performance change with input size?

When the input size increases, execution time also increases. Bubble Sort becomes much slower on large arrays. Merge Sort grows more slowly.

### How does sorted vs unsorted data affect performance?

Sorted data can help Bubble Sort if it is optimized, but in this implementation it still checks many elements. Merge Sort works almost the same for sorted and random arrays.

### Do the results match Big-O complexity?

Yes. Bubble Sort becomes slower very quickly because it is O(n²). Merge Sort is faster because it is O(n log n). Binary Search is very fast because it is O(log n).

### Which searching algorithm is more efficient? Why?

Binary Search is efficient because it divides the search area in half each time.

### Why does Binary Search require a sorted array?

Binary Search needs a sorted array because it decides whether to search the left or right half based on the middle value.

## Screenshots

<img width="425" height="530" alt="image" src="https://github.com/user-attachments/assets/dff2a6d0-2a41-4f73-91fc-70e03e6d1b60" />


## Reflection

In this assignment, I learned that algorithm efficiency is very important. Simple algorithms like Bubble Sort are easy to understand, but they are not good for large data.

I also learned that theoretical Big-O complexity usually matches practical results. Merge Sort and Binary Search are faster because they reduce the amount of work needed. The main challenge was organizing the project into separate classes and measuring execution time correctly.
