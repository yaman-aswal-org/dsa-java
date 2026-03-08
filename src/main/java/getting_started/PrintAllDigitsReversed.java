package getting_started;

import java.util.Scanner;

public class PrintAllDigitsReversed {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // print reverse of a number - 45738300 = 00383754
        printAllDigitsReversed(n);

        sc.close();
    }

    private static void printAllDigitsReversed(int n) {

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            System.out.println(dig);
        }

    }

}
