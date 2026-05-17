package basics.patterns;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        /***
         * -- print the given below --
         * --- 1 2 3 4 5
         * -1- *
         * -2- * *
         * -3- * * *
         * -4- * * * *
         * -5- * * * * *
         * --
         ****/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
