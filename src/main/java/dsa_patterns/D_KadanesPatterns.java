package dsa_patterns;

public class D_KadanesPatterns {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int value = maxSubArray(nums);
        System.out.println(value);
    }

    /**
     * <h2>Maximum Subarray</h2>
     * Given an integer array nums, find the subarray with the largest sum, and return its sum.
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     */
    public static int maxSubArray(int[] nums) {
        int best = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int v1 = best + nums[i];
            int v2 = nums[i];
            best = Math.max(v1, v2);
            ans = Math.max(ans, best);
        }
        return ans;
    }

    public static int minSubArray(int[] nums) {
        int best = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int v1 = best + nums[i];
            int v2 = nums[i];
            best = Math.min(v1, v2);
            ans = Math.min(ans, best);
        }
        return ans;
    }

    public static int maxProduct(int[] nums) {
        int minEnding = nums[0];
        int maxEnding = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = maxEnding * v1;
            int v3 = minEnding * v1;

            maxEnding = Math.max(v1, Math.max(v2, v3));
            minEnding = Math.min(v1, Math.min(v2, v3));

            ans = Math.max(ans, Math.max(minEnding, maxEnding));
        }

        return ans;
    }

    public static int maximumSum(int[] nums){
        int noDeletion = nums[0];
        int oneDeletion = 0;

        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = noDeletion + nums[i];

            oneDeletion = Math.max(noDeletion, oneDeletion + nums[i]);

            noDeletion = Math.max(v1, v2);

            ans = Math.max(ans, Math.max(noDeletion, oneDeletion));
        }

        return ans;
    }

    /** <h2>Maximum Absolute Sum of Any Subarray</h2>
     *  */
    public static int maxAbsoluteSum(int[] nums) {
        int minSum = maxSubArray(nums);
        int maxSum = minSubArray(nums);
        return Math.max(Math.abs(minSum), Math.abs(maxSum));
    }

}
