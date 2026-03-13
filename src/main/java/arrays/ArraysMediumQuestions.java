package arrays;

import arrays.base.ArraysUtils;

import java.util.List;

public class ArraysMediumQuestions {

    public static void main(String[] args) {
        int[] arr = ArraysUtils.generateIntArray();
        maxSubArray(arr);
    }

    /* Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
    and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution set must not contain duplicate triplets.

    Example 1:
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.

    Example 2:
    Input: nums = [0,1,1]
    Output: []
    Explanation: The only possible triplet does not sum up to 0.

    Example 3:
    Input: nums = [0,0,0]
    Output: [[0,0,0]]
    Explanation: The only possible triplet sums up to 0.

    */
    public List<List<Integer>> threeSum(int[] nums) {

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
