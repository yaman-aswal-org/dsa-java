package basics.getting_started;

public class Conditions {

    public static void main(String[] args) {

        if (true) {
            System.out.println("If case statement so this executed...");
        }

        int x = 23;

        // if-else statement - for even/odd statements
        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        System.out.println("hardwork is better than smartwork..");

        // NOTE: if - else if (only single statement can be true and if not then else is
        // executed)
        int n1 = 20;
        int n2 = 20;
        int n3 = 30;

        if (n1 == n2) {
            System.out.println("first line");
        } else if (n1 == n2) {
            System.out.println("second line");
        } else if (n3 >= n2) {
            System.out.println("third line");
        } else {
            System.out.println("else line");
        }

    }

}
