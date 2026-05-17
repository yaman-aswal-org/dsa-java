package recursions;

import java.util.Scanner;

public class PowerLogarithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int result = power(x, n);
        System.out.println(result);

        sc.close();
    }

    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xPow = power(x, n / 2);
        int xn = xPow * xPow;

        if (n % 2 == 1) {
            xn = xn * x;
        }

        return xn;
    }

}
