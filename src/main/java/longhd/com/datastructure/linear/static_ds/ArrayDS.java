package longhd.com.datastructure.linear.static_ds;

public class ArrayDS {
    /**
     * - Array is a collection of similar data elements takes place
     * and each data element can be accessed directly by only using its index number.
     * - Advantages:
     *      + You can access elements at random using index.
     *      + Easy sorting and iteration.
     * - Disadvantages:
     *      + Size is fixed.
     *      + Difficult to insert and delete.
     *      + If capacity is more and occupancy less, most of the array gets wasted.
     *      + Arrays store elements on contiguous memory, which requires special allocation.
     * - All in all, you might use arrays if you need to store things linearly
     * and especially if you need to seach the elements frequently.
     * - Types of Arrays:
     *      + Single dimensional array.
     *      + Double dimensional array.
     *      + Multi-Dimensional array.
     */

    public static void main(String[] args) {
        int[] arr = new int[5]; // fixed size
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Before: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        deleteElement(arr, 1);
        System.out.println();
        System.out.println("After: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");


    }

    // hard to insert
    public static void insertAtTheEnd() {

    }
    public static void insertElementToAnyPos(int[] arr, int valueToInsert, int posToInsert) {
        // shift elements to the right until get to position to insert
        for (int i = arr.length - 1; i >= posToInsert; i--) {
            arr[i+1] = arr[i];
        }
        // insert value to position
        arr[posToInsert] = valueToInsert;
    }

    // hard to delete
    public static void deleteElement(int[] arr, int posToDelete) {
        for (int i = posToDelete; i < arr.length; i++ ) {
            if (i == arr.length - 1) {
                arr[i] = 0;
                continue;
            }
            arr[i] = arr[i + 1];
        }
    }
}
