package basics.patterns;

import java.util.Scanner;

public class Pattern6 {

    /// *
    /// *** ***
    //// ** **
    //// * *
    //// ** **
    //// *** ***
    ///
    /// */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = (n / 2) + 1;
        int space = 1;

        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= star; a++) {
                System.out.print("*");
            }

            for (int b = 0; b < space; b++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= star; c++) {
                System.out.print("*");
            }

            // System.out.println(star + "," + space + "," + star);

            if (i <= n / 2) {
                star--;
                space = space + 2;
            } else {
                star++;
                space = space - 2;
            }

            System.out.println();
        }

        sc.close();
    }
}
