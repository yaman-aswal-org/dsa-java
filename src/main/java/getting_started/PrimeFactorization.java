package getting_started;

import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {

        // printAllPrimeFactor();
        printAllPrimeFactorOptimized();

    }

    private static void printAllPrimeFactor() {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int div = 2; div <= num; div++) {

            while (num % div == 0) {
                num = num / div;
                System.out.print(div + " ");
            }

        }

        sc.close();
    }

    private static void printAllPrimeFactorOptimized() {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int div = 2; div * div <= num; div++) {

            while (num % div == 0) {
                num = num / div;
                System.out.print(div + " ");
            }

        }

        if (num != 1) {
            System.out.println(num);
        }

        sc.close();
    }

}
