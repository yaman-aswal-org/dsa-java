package basics.arrays;

import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        reverseArray(arr);

        PrintArrays.printIntArray(arr);
    }

    public static void reverseArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int start = arr[i];
            int end = arr[j];

            // swap start & end
            arr[i] = end;
            arr[j] = start;

            i++;
            j--;
        }
    }

    public static void reverseArray(int[] arr, int i, int j) {

        while (i < j) {
            int start = arr[i];
            int end = arr[j];

            // swap start & end
            arr[i] = end;
            arr[j] = start;

            i++;
            j--;
        }
    }

}
