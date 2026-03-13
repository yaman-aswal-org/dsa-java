package arrays;

import arrays.base.ArraysUtils;

public class ArraysMediumQuestions {

    public static void main(String[] args) {
        int[] arr = ArraysUtils.generateIntArray();
        maxSubArray(arr);
    }

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


}
