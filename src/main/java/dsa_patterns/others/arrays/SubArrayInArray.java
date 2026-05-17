package basics.arrays;

import java.util.Scanner;

public class SubArrayInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        subArray(arr);
    }

    private static void subArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }

}
