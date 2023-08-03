package longhd.com.algorithm.sorting;

/**
 * Selection sort is an amelioration(improve) of the Bubble Sort because of the performance.
 * Even if they have the same worst-case performance, selection sort performs fewer swaps.
 *
 */
public class SelectionSort extends SortAlgorithm {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            // swapping
            int temp = arr[i];
            arr[i] = min;
            arr[minIdx] = temp;
        }
    }
}
