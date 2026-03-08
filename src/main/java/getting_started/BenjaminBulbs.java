package getting_started;

import java.util.Scanner;

public class BenjaminBulbs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // hint: print all perfect squares
        for (int i = 0; i * i <= n; i++) {
            System.out.println(i * i);
        }

        sc.close();
    }

}
