package dsa_patterns.utils;

public class BasicUtils {

    public static void main(String[] args) {}


    public static int sumOfSquaresOfDigits(int num){
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;

            sum = sum + (digit * digit);
        }

        return sum;
    }
}
