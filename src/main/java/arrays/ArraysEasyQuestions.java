package arrays;

import dsa_patterns.utils.ArraysUtils;

import java.util.HashSet;

public class ArraysEasyQuestions {

    public static void main(String[] args) {
        int[] arr = ArraysUtils.generateIntArray();
//        ArraysUtils.printArray(a);
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

}
