import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Input elements of the array");
        Scanner sc = new Scanner(System.in);

        findMaxMin();
    }

    public static void findMaxMin() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int maximum = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        int minimum = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        System.out.println("Maximum value = " + maximum);
        System.out.println("Minimum value = " + minimum);
    }
}

