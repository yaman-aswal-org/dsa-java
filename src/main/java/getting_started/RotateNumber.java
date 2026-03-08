package getting_started;

import java.util.Scanner;

public class RotateNumber {

    public static void main(String[] args) {
        // Rotate a number.
        rotateNumber();
    }

    public static void rotateNumber() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = n;

        int count = CountAllDigits.countAllDigits(n);
        System.out.println(num);

        k = k % num;
        if (k < 0) {
            k = k * count;
        }

        int div = 1;
        int mult = 1;

        for (int i = 1; i <= count; i++) {

            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }

        }

        int qou = num / div;
        int rem = num % div;

        int rotate = rem * mult + qou;
        System.out.println(rotate);

        sc.close();
    }

}
