package recursions;

import java.util.Scanner;

public class PrintIncreasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Output: if n = 5, then -> 1,2,3,4,5
        printIncreasing(n);

        sc.close();
    }

    private static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

}
