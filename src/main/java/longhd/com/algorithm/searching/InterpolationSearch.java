package longhd.com.algorithm.searching;

/**
 * Interpolation search is an improvement over binary search, best used for "uniformly" distributed data
 * "guesses" where a value might be based on calculated probe result, if probe is incorrect, search area is narrowed
 * and new probe is calculated.
 * Average case run time complexity: O(log(logN))
 * Worst case: O(n) [values increase exponentially]
 */
public class InterpolationSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 128, 256, 512, 1024};
        int target = 256;
        int index = interpolationSearch(array, target);
        if (index == -1) {
            System.out.println("Target: " + target + " not found.");
        } else {
            System.out.println("Element found at: " + index);
        }
    }

    private static int interpolationSearch(int[] array, int targetValue) {
        int highIndex = array.length - 1;
        int lowIndex = 0;

        while (targetValue > array[lowIndex] && targetValue <= array[highIndex] && lowIndex < highIndex) {
            int probe = lowIndex +
                    (highIndex - lowIndex) * (targetValue - array[lowIndex]) / (array[highIndex] - array[lowIndex]);
            System.out.println("probe: " + probe);

            if (array[probe] == targetValue) {
                return probe;
            } else if (array[probe] < targetValue) {
                lowIndex = probe + 1;
            } else {
                highIndex = probe - 1;
            }
        }
        return -1;
    }
}
