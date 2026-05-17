package basics.patterns;

import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n;
        if (num % 2 == 0) {
            n = num + 1;
        } else {
            n = num;
        }
        System.out.println(n);

        int sp = n / 2;
        int st = 1;
        int val = 1;

        for (int i = 1; i <= n; i++) {
            int cval = val;

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= st; k++) {
                System.out.print(cval + "\t");

                if (k <= n / 2) {
                    if (cval == st) {
                        cval--;
                    } else {
                        cval++;
                    }
                } else {
                    cval--;
                }
            }

            if (i <= n / 2) {
                val++;
            } else {
                val--;
            }

            if (i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }

            System.out.println();
        }

        sc.close();
    }
}
