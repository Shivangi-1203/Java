import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapNumbers(a,b);
    }
    private static void swapNumbers(int a, int b) {
        a=(a+b);
        b=a-b;
        a=a-b;

        System.out.println(a + "," + b);
    }
}
