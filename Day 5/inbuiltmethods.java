import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1};

        Arrays.sort(arr);  
        System.out.println("Sorted: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 9);
        System.out.println("Index of 9: " + index);

        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied: " + Arrays.toString(copy));
    }
}
