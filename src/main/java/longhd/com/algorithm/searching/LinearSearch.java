package longhd.com.algorithm.searching;

/**
 * linear search = Iterate through a collection one element at a time.
 * Run time complexity: O(n).
 * Advantage:
 *      + Fast for search of all small to medium data sets.
 *      + Does not need to sorted.
 *      + Useful for data structures that do not have random access (LinkedList)
 * Disadvantage:
 *      + Slow for large data sets.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 5 ,4};
        int index = search(array, 9);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
