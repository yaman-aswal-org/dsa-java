package getting_started;

import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String name = scn.nextLine();
        System.out.println("Enter your number with name: ");
        System.out.println(name);

        int n = scn.nextInt();

        System.out.println("User Input: " + n);

        for (int k = 1; k <= n; k++) {
            System.out.println(k);
        }

        scn.close();
    }
}
