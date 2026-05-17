package basics.arrays;

import java.util.Scanner;

public class BarChartInArray {

    /*
     * n = 4
     * 3,5,6,2
     * 
     * // _ _ * _
     * // _ * * _
     * // _ * * _
     * // * * * _
     * // * * * *
     * // * * * *
     * 
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        System.out.println("max: " + max);

        int min = max;

        while (min > 0) {

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] >= min) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            min--;
            System.out.println();
        }

    }

}
