package longhd.com.algorithm.sorting;

/**
 * Bubble sort is a simple sorting algorithm that works by
 * swapping the items between them if they are in wrong order.
 * Average-case complexity of the Bubble Sort is О(n2) and
 * The best-case complexity is O(n). That's the case where the data is already sorted.
 * small data set = ok-ish.
 * large data set = bad.
 */
public class BubbleSort extends SortAlgorithm {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
