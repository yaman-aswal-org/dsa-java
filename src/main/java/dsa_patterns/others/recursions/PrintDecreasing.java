package recursions;

import java.util.Scanner;

public class PrintDecreasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Output: if n = 5, then -> 5,4,3,2,1
        printDecreasing(n);

        sc.close();
    }

    private static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

}
