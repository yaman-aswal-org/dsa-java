package basics.arrays;

import java.util.Scanner;

//Important Question
public class SubSetsOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        subSetsOfArray(arr);
    }

    public static void subSetsOfArray(int[] arr) {

        int limit = (int) Math.pow(2, arr.length);
        System.out.println("limit is: " + limit);

        for (int i = 0; i < limit; i++) {
            // convert i into binary and use 0's and 1's

            String set = "";
            int temp = i;

            for (int j = arr.length - 1; j >= 0; j--) {

                int r = temp % 2;
                temp = temp / 2;

                if (r == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t" + set;
                }
            }

            System.out.println(set);
        }
    }

}
