package longhd.com.datastructure.nonlinear.heap_ds;

import java.util.Arrays;

/**
 * Heap is a special Tree-based data structure in which the tree is a complete binary tree.
 * Operations of Heap DS:
 *      + Heapify: a process of creating a heap from array.
 *      + Insertion: process to insert an element in existing heap time complexity O(logN).
 *      + Deletion: deleting the top element of the heap or the highest priority element, and then organizing the heap
 *      and returning the element with time complexity O(NlogN).
 *      + Peek: to check or find the first (or can say the top) element of the heap.
 * Types of Heap Data Structure:
 *      + Max-Heap: In a Max-Heap the key present at the root node must be greatest among the keys present at all
 *      of it's children. The same property must be recursively true for all subtrees in that Binary Tree.
 *      + Min-Heap: In a Min-Heap the key present at the root node must be minimum among the keys present at all of
 *      it's children. The same property must be recursively true for all subtrees in that Binary Tree.
 */
public class HeapDS {
    public static void main(String[] args) {
        System.out.println("======== Min Heap =========");
        MinHeapDS minHeap = new MinHeapDS();
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);
        System.out.println("Parent: " + minHeap.getParentValue(1));
        System.out.println("Left: " + minHeap.getLeftChildValue(0));
        System.out.println("Right: " + minHeap.getRightChildValue(0));

        System.out.println("======== Max Heap =========");
        MaxHeapDS maxHeap = new MaxHeapDS();
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(3);
        System.out.println("Parent: " + maxHeap.getParentValue(1));
        System.out.println("Left: " + maxHeap.getLeftChildValue(0));
        System.out.println("Right: " + maxHeap.getRightChildValue(0));
    }
}
