import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        System.out.println("Enter length of array:");

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter elements of the array ");

        checkArray();

    }

    public static void checkArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        int i;
        for (i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int flag = 0;
        for (i = 0; i < n - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("The array is not sorted in ascending order.");
        } else {
            System.out.println("The array is sorted in ascending order.");
        }
    }
}

