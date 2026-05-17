package basics.patterns;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {

        /***
         * -- print the given below --
         * --- 1 2 3 4 5
         * -1- * * * * * -> 0 space, 5 star
         * -2- - * * * * -> 1 space, 4 star
         * -3- - - * * * -> 2 space, 3 star
         * -4- - - - * *
         * -5- - - - - *
         * --
         ****/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int space = 1; space < i; space++) {
                System.out.print("_ ");
            }

            for (int j = num - i; j >= 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
