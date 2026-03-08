package getting_started;

public class Loops {

    public static void main(String[] args) {

        // print 1 to 10
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i = i + 1; // i++; this can be used as well
        }

        System.out.println("While LOOP - Done.");

        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }

        System.out.println("for LOOP - Done.");
    }

}
