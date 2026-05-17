package recursions;

import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("print all array content using recursion");

        printAnIntArray(arr, 0);

        sc.close();
    }

    public static void printAnIntArray(int[] arr, int idx) {

        if (idx == arr.length) {
            return;
        }

        System.out.println(arr[idx]);

        printAnIntArray(arr, idx + 1);

    }
}
