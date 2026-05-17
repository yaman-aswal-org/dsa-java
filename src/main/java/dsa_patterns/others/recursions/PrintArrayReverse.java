package recursions;

import java.util.Scanner;

public class PrintArrayReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("print all array content using recursion");

        printAnIntArrayReverse(arr, arr.length - 1);

        sc.close();
    }

    public static void printAnIntArrayReverse(int[] arr, int idx) {

        if (idx < 0) {
            return;
        }

        System.out.println(arr[idx]);

        printAnIntArrayReverse(arr, idx - 1);

    }
}
