package getting_started;

import java.util.Scanner;

public class PrimeNumberQuestions {

    public static void main(String[] args) {
        isNumberPrime(); // not optimized
        isNumberPrimeSquareRoot(); // optimized

        printAllPrimeNumbers();
    }

    public static void isNumberPrime() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is not prime number");
            }
        }

        sc.close();
    }

    public static void isNumberPrimeSquareRoot() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is not prime number");
            }
        }

        sc.close();
    }

    public static void printAllPrimeNumbers() {

        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int n = low; n <= high; n++) {

            int count = 0;

            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(n);
            }
        }

        sc.close();
    }
}
