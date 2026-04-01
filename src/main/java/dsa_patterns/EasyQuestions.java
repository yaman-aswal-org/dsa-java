package dsa_patterns;

import dsa_patterns.utils.ArraysUtils;

import java.util.HashSet;
import java.util.Scanner;

public class EasyQuestions {

    public static void main(String[] args) {

    }

    private static void findAnElementInAnArray(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {

            if (target == arr[i]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not exist in array.");
        }

    }

    /* Given an integer array nums, return true if any value appears more than once in the array,
     otherwise return false. */
    private static void containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        boolean hasDuplicate = false;

        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                hasDuplicate = true;
                break;
            }

            seen.add(nums[i]);
        }

        if (hasDuplicate) {
            System.out.println("Duplicate Found.");
        } else {
            System.out.println("No Duplicate Found.");
        }
    }

    /* You are given an integer array nums of length n.
    Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).*/
    private static void concatenationOfArray(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }

        ArraysUtils.printArray(ans);
    }

    /* You are given an array arr, replace every element in that array with the greatest element among the elements to its right,
     and replace the last element with -1.
     Approach:
     - Do a single pass from right to left.
     - Keep a running max of elements to the right (initialize as -1 for the last element).
     - For each index i, store the current element in a temp, set arr[i] to the running max, and update the running max with max(runningMax, temp).
     */
    private static void replaceElementsWithGreatestElementOnRightSide(int[] arr) {
        int n = arr.length;
        int maxRight = -1; // for the last element

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];       // value to compare for next iteration
            arr[i] = maxRight;       // greatest to the right (or -1 for last)
            maxRight = Math.max(maxRight, temp); // update the running max
        }
    }



    //medium

    /* Given an integer array nums,
  find the subarray with the largest sum, and return its sum.
  nums = [-2,1,-3,4,-1,2,1,-5,4]
  Output: 6
  Explanation: The subarray [4,-1,2,1] has the largest sum 6.
  (Using Kadane's Algorithm) */
    private static void maxSubArray(int[] nums) {

    }

    /* You are given an integer array prices where prices[i] is the price of Stock on the ith day.
    You may choose a single day to buy one Stock and choose a different day in the future to sell it.
    Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0.
    prices = [10,1,5,6,7,1]
    Output: 6
*/
    private static void bestTimeBuyAndSellStock(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            profit = prices[i] - min;
        }

        System.out.println(profit);
    }


    private static void benjaminBulbs(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // hint: print all perfect squares
        for (int i = 0; i * i <= n; i++) {
            System.out.println(i * i);
        }

        sc.close();
    }

    public static void printFibonacciToNumber() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + ",");
            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }

    public static void findGCDAndLCM(){

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int on1 = n1;
        int on2 = n2;

        // gcd
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;
        // lcm <= gcd * lcm = n1 * n1;
        int lcm = (on1 * on2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
        sc.close();

    }

    private static void printAllDigitsReversed(int n) {

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            System.out.println(dig);
        }

    }

    public static void isNumberPrime() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is not prime number");
            }
        }

        sc.close();
    }

    public static void isNumberPrimeSquareRoot() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is not prime number");
            }
        }

        sc.close();
    }

    public static void printAllPrimeNumbers() {

        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int n = low; n <= high; n++) {

            int count = 0;

            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(n);
            }
        }

        sc.close();
    }

    private static void printAllPrimeFactorOptimized() {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int div = 2; div * div <= num; div++) {

            while (num % div == 0) {
                num = num / div;
                System.out.print(div + " ");
            }

        }

        if (num != 1) {
            System.out.println(num);
        }

        sc.close();
    }

    public static int countAllDigits(int n) {

        int digit = 0;

        if (n == 0) {
            System.out.println(1);
            return 1;
        }

        while (n != 0) {
            n = n / 10;
            digit++;
        }

        System.out.println(digit);
        return digit;
    }

    public static void printAllDigits(int n) {

        int count = countAllDigits(n);

        int div = (int) Math.pow(10, count - 1);

        while (div != 0) {
            int q = n / div;
            System.out.println(q);
            n = n % div;
            div = div / 10;
        }

    }

    public static void rotateNumber() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = n;

        int count = countAllDigits(n);
        System.out.println(num);

        k = k % num;
        if (k < 0) {
            k = k * count;
        }

        int div = 1;
        int mult = 1;

        for (int i = 1; i <= count; i++) {

            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }

        }

        int qou = num / div;
        int rem = num % div;

        int rotate = rem * mult + qou;
        System.out.println(rotate);

        sc.close();
    }

}
