package dsa_patterns;

import arrays.base.ArraysUtils;

import java.util.List;

public class TwoPointers {

    public static void main(String[] args) {
        int[] arr = ArraysUtils.generateIntArray();
//        int[] a = twoSum(arr, 6);
//        int[] b = sortedSquares(arr);
//        ArraysUtils.printArray(a);

    }

    /*
    Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
    Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.
    The tests are generated such that there is exactly one solution. You may not use the same element twice.
    Your solution must use only constant extra space.

    Example 1:
    Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

    Example 2:
    Input: numbers = [2,3,4], target = 6
    Output: [1,3]
    Explanation: The sum of 2 and 4 is 6. Therefore, index1 = 1, index2 = 3. We return [1, 3].

    Example 3:
    Input: numbers = [-1,0], target = -1
    Output: [1,2]
    Explanation: The sum of -1 and 0 is -1. Therefore, index1 = 1, index2 = 2. We return [1, 2].
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

    /*
     Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

        Example 1:
        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].

        Example 2:
        Input: nums = [-7,-3,2,3,11]
        Output: [4,9,9,49,121]

    *
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
}
