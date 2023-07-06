package longhd.com.datastructure.nonlinear.heap_ds;

import java.util.Arrays;

public class MaxHeapDS {
    private int size = 0;
    private int capacity = 10;
    private int[] items = new int[capacity];

    private int getLeftChildIndex(int parentIndex) {return 2 * parentIndex + 1;}
    private int getRightChildIndex(int parentIndex) {return 2* parentIndex + 2;}
    private int getParentIndex(int childIndex) {return (childIndex - 1) / 2;}

    int getLeftChildValue(int index) { return items[getLeftChildIndex(index)];}
    int getRightChildValue(int index) { return items[getRightChildIndex(index)];}
    int getParentValue(int index) { return items[getParentIndex(index)];}

    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }
    private boolean hasParent(int index) { return getParentIndex(index) >= 0; }

    private void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
        }
    }

    public int peek() {
        if (size == 0) throw new IllegalArgumentException();
        return items[0];
    }

    public int poll() {
        if (size == 0) throw new IllegalArgumentException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item) {
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size -1;
        while (hasParent(index) && getParentValue(index) < items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasRightChild(index)) {
            int biggerChildIndex = getRightChildIndex(index);
            if (hasLeftChild(index) && getLeftChildValue(index) > getRightChildValue(index)) {
                biggerChildIndex = getLeftChildIndex(index);
            }

            if (items[index] > items[biggerChildIndex]) {
                break;
            } else {
                swap(index, biggerChildIndex);
                index = biggerChildIndex;
            }
        }
    }
}
