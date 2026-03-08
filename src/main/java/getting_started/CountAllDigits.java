package getting_started;

import java.util.Scanner;

public class CountAllDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // count digits - 457383 = 6 digits
        countAllDigits(n);

        sc.close();
    }

    public static int countAllDigits(int n) {

        int digit = 0;

        if (n == 0) {
            System.out.println(1);
            return 1;
        }

        while (n != 0) {
            n = n / 10;
            digit++;
        }

        System.out.println(digit);
        return digit;
    }

}
