package getting_started;

public class Variables {

    public static void main(String[] args) {

        // Data types
        int x = 15;
        int y = 20;

        // add
        int sum = x + y;

        System.out.println("Sum of " + x + " and " + y + " is " + sum);

        // multiply
        int prod = x * y;
        System.out.println("Product of " + x + " and " + y + " is " + prod);

        // divide
        int v1 = x / y;
        int v2 = y / x;
        int v3 = y % x;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        // exp
        /*
         * xy/x + y
         */

        // NOTE: * / % > + -
        // left side first execute first based in * / % + -
        int exp = x * y / x + y;
        // Bracket used to exvalute first and then divide exp
        int exp1 = (x * y) / (x + y);
        System.out.println("Exp: " + exp);
        System.out.println("Exp 1: " + exp1);
    }

}
