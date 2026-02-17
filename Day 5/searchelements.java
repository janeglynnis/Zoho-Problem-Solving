public class ReverseStringArray {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Mango", "Orange"};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
