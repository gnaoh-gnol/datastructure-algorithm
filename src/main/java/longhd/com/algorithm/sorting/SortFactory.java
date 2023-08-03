package longhd.com.algorithm.sorting;

public class SortFactory {
    public static SortAlgorithm getSortAlgorithm(SortType sortType) {
        switch (sortType) {
            case BUBBLE -> {
                return new BubbleSort();
            }
            case SELECTION ->  {
                return new SelectionSort();
            }
            case MERGE -> {
                return new MergeSort();
            }
            default -> {
                throw new IllegalArgumentException("This sort type is unsupported");
            }
        }
    }
}
