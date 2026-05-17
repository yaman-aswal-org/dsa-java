package basics.patterns;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {

        /***
         * -- print the given below --
         * --- 1 2 3 4 5
         * -1- _ _ _ _ * -> 4 space, 1 star
         * -2- _ _ _ * * -> 3 space, 2 star
         * -3- _ _ * * *
         * -4- _ * * * *
         * -5- * * * * *
         * --
         ****/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int space = 1; space <= num - i; space++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
