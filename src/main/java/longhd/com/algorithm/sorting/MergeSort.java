package longhd.com.algorithm.sorting;

/**
 * Merge sort = recursively divide array in 2, sort, re-combine
 * run-time complexity = O(n Log n)
 * space complexity    = O(n)
 */
public class MergeSort extends SortAlgorithm {
    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        System.arraycopy(arr, 0, leftArr, 0, middle);
        if (length - middle >= 0)
            System.arraycopy(arr, middle, rightArr, 0, length - middle);
//        for (int i = middle; i < length; i++) {
//            rightArr[i - middle] = arr[i];
//        }
        sort(leftArr);
        sort(rightArr);
        merge(leftArr, rightArr, arr);

    }

    public void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0;
        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }
}
