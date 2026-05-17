package basics.patterns;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                if (i + j == num + 1) {
                    System.out.print("*");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

        sc.close();

    }
}
