package dsa_patterns;

public class SlidingWindowPatterns {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 4};
//        int value = minSubArrayLen(4, nums);
//        System.out.println(value);
    }

    /**
     * <h2>Max Sum Subarray of size K (Easy)</h2>
     * Given an array of integers arr[]  and a number k.
     * <p>
     * Return the maximum sum of a subarray of size k.
     * <p>
     * Note: A subarray is a contiguous part of any given array.
     * <p>
     * Input: arr[] = [100, 200, 300, 400], k = 2
     * Output: 700
     * <p>
     * Explanation: arr2 + arr3 = 700, which is maximum.
     * <p>
     * Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
     * Output: 39
     * <p>
     * Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
     *
     */
    private static void maxSumSubarrayOfSizeK(int[] nums, int k) {
        int low = 0;
        int high = k - 1;
        int windowSum = 0;
        int maxSum = 0;

        // sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        while (high < nums.length) {
            maxSum = Math.max(maxSum, windowSum);

            low++;
            high++;

            windowSum = windowSum - nums[low - 1];

            if (high >= nums.length) {
                break;
            }

            windowSum = windowSum + nums[high];
        }

    }


    private static int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int windowSum = 0;
        int res = Integer.MAX_VALUE;

        while (high < nums.length) {
            windowSum = windowSum + nums[high];

            while (windowSum >= target) {
                int len = high - low + 1;
                res = Math.min(res, len);
                windowSum = windowSum - nums[low];
                low++;
            }

            high++;
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }


}
