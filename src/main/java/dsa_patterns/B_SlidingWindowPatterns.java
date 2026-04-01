package dsa_patterns;

import java.util.HashMap;

public class B_SlidingWindowPatterns {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 4};
//        int value = minSubArrayLen(4, nums);
//        System.out.println(value);
        String s = "aabacbebebe";
        int value = longestSubstringWithKUniques(s, 3);
        System.out.println(value);
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


    /**
     * <h2>Longest Substring with K Uniques (Medium)</h2>
     * You are given a string s consisting only lowercase alphabets and an integer k.
     * <p>
     * Your task is to find the length of the longest substring that contains exactly k distinct characters.
     * <p>
     * Note : If no such substring exists, return -1.
     * <p>
     * Input: s = "aabacbebebe", k = 3
     * Output: 7
     * Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
     * <p>
     * Input: s = "aaaa", k = 2
     * Output: -1
     * Explanation: There's no substring with 2 distinct characters.
     * <p>
     * Input: s = "aabaaab", k = 2
     * Output: 7
     * Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
     */
    private static int longestSubstringWithKUniques(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        int low = 0;

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1); //add + 1 or 0 as default

            while (map.size() > k) {
                char lowChar = s.charAt(low);

                if (!map.isEmpty()) {
                    Integer value = map.get(lowChar);
                    value = value - 1;
                    map.put(lowChar, value);
                }

                if (map.get(lowChar) == 0) {
                    map.remove(lowChar);
                }

                low++;
            }

            if (map.size() == k) {
                int len = high - low + 1;
                res = Math.max(res, len);
            }

        }

        return res;
    }


    /**
     * <h1>Fruit Into Baskets (Medium)</h1>
     * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
     * <p>
     * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
     * <p>
     * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
     * <p>
     * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
     * <p>
     * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
     * <p>
     * Given the integer array fruits, return the maximum number of fruits you can pick.
     * <p>
     * Example 1:
     * <p>
     * Input: fruits = [1,2,1]
     * Output: 3
     * Explanation: We can pick from all 3 trees.
     * <p>
     * Example 2:
     * Input: fruits = [0,1,2,2]
     * Output: 3
     * Explanation: We can pick from trees [1,2,2].
     * If we had started at the first tree, we would only pick from trees [0,1].
     * <p>
     * Example 3:
     * Input: fruits = [1,2,3,2,2]
     * Output: 4
     * Explanation: We can pick from trees [2,3,2,2].
     * If we had started at the first tree, we would only pick from trees [1,2].
     *
     */
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int low = 0;
        int k = 2; //at most 2

        for (int high = 0; high < fruits.length; high++) {

            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1); //add + 1 or 0 as default

            while (map.size() > k) {
                Integer lowInt = fruits[low];

                Integer value = map.get(lowInt);
                value = value - 1;
                map.put(lowInt, value);

                if (map.get(lowInt) == 0) {
                    map.remove(lowInt);
                }

                low++;
            }

            //calculate
            int len = high - low + 1;
            res = Math.max(res, len);

        }

        return res;
    }

    /**
     * Given a string s, find the length of the longest substring without duplicate characters.
     * <p>
     * Example 1:
     * Input: s = "abcabcbb"
     * Output: 3
     * <p>
     * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
     * <p>
     * Example 2:
     * Input: s = "bbbbb"
     * Output: 1
     * <p>
     * Explanation: The answer is "b", with the length of 1.
     * <p>
     * Example 3:
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * <p>
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     *
     * @return
     */
    private static int longestSubstringWithoutRepeatingCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = Integer.MIN_VALUE;
        int low = 0;

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1); //add + 1 or 0 as default

            int k = high - low + 1; //window size calculate.

            while (map.size() < k) {
                char lowChar = s.charAt(low);

                Integer value = map.get(lowChar);
                value = value - 1;
                map.put(lowChar, value);

                if (map.get(lowChar) == 0) {
                    map.remove(lowChar);
                }

                low++;
                k = high - low + 1; //window size calculate.
            }

            int len = high - low + 1;
            res = Math.max(res, len);
        }

        return res;
    }

    /**
     * <h2>Subarray Product Less Than K</h2>
     * <p>
     * Given an array of integers nums and an integer k,
     * return the number of contiguous subarrays
     * where the product of all the elements in the subarray is strictly less than k.
     * </p>
     * <p>
     * Example 1:
     * Input: nums = [10,5,2,6], k = 100
     * Output: 8
     * <p>
     * <p>
     * Explanation: The 8 subarrays that have product less than 100 are:
     * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
     * Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
     * </p>
     * <p>
     * Example 2:
     * Input: nums = [1,2,3], k = 0
     * Output: 0
     * <p>
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0;
        int count = 0;
        int product = 1;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product = product / nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }


}
