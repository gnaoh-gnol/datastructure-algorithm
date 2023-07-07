package longhd.com.algorithm.searching;

import java.util.Arrays;

/**
 * Binary search is a search algorithm that finds the position of a target value within a sorted array.
 * Half of the array is eliminated during each "step".
 * Binary search isn't efficient when working with small data sets. However, if you're working a large data set like
 * 1 million elements, binary search is actually fantastic. Because we're elimination half of the elements we are
 * searching through.
 * Run time complexity: O(logN)
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println("Target: " + target + " not found.");
        } else {
            System.out.println("Element found at: " + index);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            int valueInMid = array[middleIndex];

            System.out.println("Middle: " + valueInMid);

            if (valueInMid < target) lowIndex = middleIndex + 1;
            else if (valueInMid > target) highIndex = middleIndex - 1;
            else return middleIndex;
        }
        return -1;
    }


}
