package recursions;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        // num, source, destination, helper
        towerOfHanoi(n, n1, n2, n3);

        sc.close();
    }

    public static void towerOfHanoi(int n, int n1, int n2, int n3) {
        if (n == 0) {
            return;
        }

        towerOfHanoi(n - 1, n1, n3, n2);
        System.out.println("[" + n1 + "->" + n2 + "]");
        towerOfHanoi(n - 1, n3, n2, n1);

    }

}
