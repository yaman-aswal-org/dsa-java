package basics.patterns;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {

        /***
         * -- print the given below --
         * // *
         * // * * *
         * // * * * * *
         * // * * *
         * // *
         ****/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int star = 1;
        int space = num / 2;

        for (int i = 1; i <= num; i++) {

            // System.out.println(space + "," + star);
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }

            if (i <= num / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }

            System.out.println();
        }

        sc.close();
    }
}
