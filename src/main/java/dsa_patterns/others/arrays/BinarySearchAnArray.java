package basics.arrays;

import java.util.Scanner;

/* -- Most Important Question -- */
public class BinarySearchAnArray {

    // Required Sorted array in Binary Search

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("find which value: ");
        int data = sc.nextInt();

        sc.close();

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (data == arr[mid]) {
                System.out.println(mid);
                return;
            } else if (data > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        System.out.println(-1);
    }

}
