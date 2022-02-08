public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) {
                    // arr[minimum] = arr[j];
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            ;
            arr[minimum] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
