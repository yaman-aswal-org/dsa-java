package basics.arrays;

import java.util.Scanner;

//Important Qeustion
public class RotateAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K Value for rotation:");
        int k = sc.nextInt();

        sc.close();

        // get rotate length
        k = k % arr.length;

        // for negative numbers
        if (k < 0) {
            k = k + arr.length;
        }

        // part 1 - reverse
        ReverseAnArray.reverseArray(arr, 0, arr.length - k - 1);

        // part 2 - reverse
        ReverseAnArray.reverseArray(arr, arr.length - k, arr.length - 1);

        // all reverse
        ReverseAnArray.reverseArray(arr, 0, arr.length - 1);

        PrintArrays.printIntArray(arr);
    }

}
