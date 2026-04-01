package dsa_patterns;

import dsa_patterns.utils.ArraysUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_TwoPointersPatterns {

    public static void main(String[] args) {
//        int[] arr = ArraysUtils.generateIntArray();
//        int[] a = twoSum(arr, 6);
//        int[] b = sortedSquares(arr);
//        int[] nums = new int[]{1, 2, 0, 1, 0, 0, 0, 0};
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(nums);
//        List res = threeSum(nums);
//        ArraysUtils.printArray(a);
    }

    /**
     * <h2>Two Sum (Easy) </h2>
     * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
     * find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
     * Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.
     * The tests are generated such that there is exactly one solution. You may not use the same element twice.
     * Your solution must use only constant extra space.
     * <p>
     * Example 1:
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     * <p>
     * Example 2:
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3]
     * Explanation: The sum of 2 and 4 is 6. Therefore, index1 = 1, index2 = 3. We return [1, 3].
     * <p>
     * Example 3:
     * Input: numbers = [-1,0], target = -1
     * Output: [1,2]
     * Explanation: The sum of -1 and 0 is -1. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     */
    private static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i != j) {

            int sum = numbers[i] + numbers[j];

            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }

        return new int[]{};
    }

    /**
     * <h2>Segregate 0s and 1s (Easy) </h2>
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * <p>
     * Note that you must do this in-place without making a copy of the array.
     *
     */
    private static void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != 0) {

                ArraysUtils.swapTwoNumbers(nums, left, right);

                left++;
            }
        }
    }

    /**
     * <h2>Remove Duplicates (Easy)</h2>
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     * <p>
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * <p>
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     */
    public int removeDuplicatesFromSortedArray(int[] nums) {
        int i = 0;
        int j = 0;
        if (nums == null || nums.length == 0) return 0;
        int count = 1;

        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
                count++;
            }
            j++;
        }

        return count;
    }

    /**
     * <h2>Squaring a Sorted Array (Medium)</h2>
     * Given an integer array nums sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example 1:
     * Input: nums = [-4,-1,0,3,10]
     * <p>
     * Output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     * <p>
     * Example 2:
     * Input: nums = [-7,-3,2,3,11]
     * <p>
     * Output: [4,9,9,49,121]
     */
    public static int[] sortedSquares(int[] nums) {
        int pos = -1;
        int neg = -1;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg = i;
            } else {
                pos = i;
                break;
            }
        }

        int i = 0;

        if (neg == -1) {
            for (int x = 0; x < nums.length; x++) {
                ans[i] = nums[x] * nums[x];
                i++;
            }
        } else if (pos == -1) {
            for (int x = nums.length - 1; x >= 0; x--) {
                ans[i] = nums[x] * nums[x];
                i++;
            }
        } else {

            while (pos < nums.length && neg >= 0) {
                int posValue = nums[pos] * nums[pos];
                int negValue = nums[neg] * nums[neg];

                if (posValue <= negValue) {
                    ans[i] = posValue;
                    pos++;
                } else {
                    ans[i] = negValue;
                    neg--;
                }

                i++;
            }

            while (pos < nums.length) {
                int posValue = nums[pos] * nums[pos];
                ans[i] = posValue;
                pos++;
                i++;
            }

            while (neg >= 0) {
                int negValue = nums[neg] * nums[neg];
                ans[i] = negValue;
                neg--;
                i++;
            }

        }

        return ans;
    }


    /**
     * <h2>Three Sum (Medium)</h2>
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
     * and nums[i] + nums[j] + nums[k] == 0.
     * Notice that the solution set must not contain duplicate triplets.
     * <p>
     * Example 1:
     * Input: nums = [-1,0,1,2,-1,-4]
     * <p>
     * Output: [[-1,-1,2],[-1,0,1]]
     * <p>
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not matter.
     * <p>
     * Example 2:
     * Input: nums = [0,1,1]
     * <p>
     * Output: []
     * <p>
     * Explanation: The only possible triplet does not sum up to 0.
     * <p>
     * Example 3:
     * Input: nums = [0,0,0]
     * <p>
     * Output: [[0,0,0]]
     * <p>
     * Explanation: The only possible triplet sums up to 0.
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int sum = -nums[i];
            List<List<Integer>> res = twoSumWithoutDuplicates(nums, sum, i + 1, nums.length - 1);
            ans.addAll(res);
        }

        ans.forEach(System.out::println);

        return ans;
    }

    private static List<List<Integer>> twoSumWithoutDuplicates(int[] numbers, int target, int left, int right) {
        List<List<Integer>> ans = new ArrayList<>();

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                List<Integer> list = new ArrayList<>();
                list.add(numbers[left]);
                list.add(numbers[right]);
                list.add(-sum);
                ans.add(list);
                left++;
                right--;

                if (left < right) {
                    while (left < right && numbers[left] == numbers[left - 1]) {
                        left++;
                    }

                    while (left < right && numbers[right] == numbers[right + 1]) {
                        right--;
                    }
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }


    /**
     * <h2>Sort Colors - Dutch National Flag Problem (Medium)</h2>
     * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
     * <p>
     * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     * <p>
     * You must solve this problem without using the library's sort function.
     * <p>
     * Example 1:
     * Input: nums = [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     *
     */
    public static void sortColors(int[] nums) {

        int left = 0; //0
        int mid = 0; //1
        int right = nums.length - 1; //2

        while (mid <= right) {

            if (nums[mid] == 0) {
                ArraysUtils.swapTwoNumbers(nums, left, mid);
                mid++;
                left++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                ArraysUtils.swapTwoNumbers(nums, mid, right);
                right--;
            }

        }

        ArraysUtils.printArray(nums);

    }

    /**
     * <h2>3 - Sum Closet</h2>
     * Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.
     * <p>
     * Return the sum of the three integers.
     * <p>
     * You may assume that each input would have exactly one solution.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [-1,2,1,-4], target = 1
     * <p>
     * Output: 2
     * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [0,0,0], target = 1
     * <p>
     * Output: 0
     * <p>
     * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
     */
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum; // exact match
                }
            }
        }

        return closestSum;
    }


}
