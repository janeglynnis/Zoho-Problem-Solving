public class MinArray {
    public static void main(String[] args) {
        int[] arr = {10, 55, 3, 89, 21};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum = " + min);
    }
}
