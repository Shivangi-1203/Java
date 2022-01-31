import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Give input");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
}