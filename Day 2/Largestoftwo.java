
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println(max);
        sc.close();
    }
}
