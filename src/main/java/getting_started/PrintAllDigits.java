package getting_started;

import java.util.Scanner;

public class PrintAllDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // print all digits - 45738300 = 4,5,7,3,8,3,0,0
        printAllDigits(n);

        sc.close();
    }

    public static void printAllDigits(int n) {

        int count = CountAllDigits.countAllDigits(n);

        int div = (int) Math.pow(10, count - 1);

        while (div != 0) {
            int q = n / div;
            System.out.println(q);
            n = n % div;
            div = div / 10;
        }

    }

}
