package arrays.base;

import java.util.Scanner;

public class ArraysUtils {

    public static void printArray(int[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            System.out.print(value);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }

    public static void printArray(String[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            String value = arr[i];
            System.out.print(value);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }

    public static int[] generateIntArray(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Value at Index " + i + ":");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static String[] generateStringArray(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Value at Index " + i + ":");
            arr[i] = sc.next();
        }

        return arr;
    }


}
