package longhd.com.algorithm.sorting;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        SortAlgorithm bubbleSort = SortFactory.getSortAlgorithm(SortType.BUBBLE);
        SortAlgorithm mergeSort = SortFactory.getSortAlgorithm(SortType.MERGE);
        //bubbleSort.sort(array);
        mergeSort.sort(array);
        printArray(array);
    }

    public static void addRandomElement(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000000);
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
