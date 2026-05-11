package dsa_patterns;

import java.util.HashMap;

public class _5_PrefixSumPattern {

    public static void main(String[] args) {

    }

    public static int pivotIndex(int[] nums) {

        int total = 0;

        // Step 1: total sum
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        // Step 2: check pivot
        for (int i = 0; i < nums.length; i++) {

            //right sum of i
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            //left sum of i
            leftSum += nums[i];
        }

        return -1;
    }

    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); //one time for empty set

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int question = sum - k;

            if (map.containsKey(question)) {
                ans += map.get(question);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); //one time for empty set

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;

            //handle negative values
            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {
                ans += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return ans;
    }

}
