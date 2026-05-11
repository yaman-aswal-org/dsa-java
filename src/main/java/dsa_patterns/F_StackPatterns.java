package dsa_patterns;

import java.util.Stack;

public class F_StackPatterns {

    public static void main(String[] args) {
        String s = "abbaca";
        removeDuplicates(s);

        String s1 = "[]";
        boolean value = validParentheses(s1);
        if (value) {
            System.out.println("Valid..");
        } else {
            System.out.println("In - Valid..");
        }

    }

    /**
     * <H2>Remove All Adjacent Duplicates In String</H2>
     * <p>
     * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
     * <p>
     * We repeatedly make duplicate removals on s until we no longer can.
     * <p>
     * Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abbaca"
     * Output: "ca"
     * <p>
     * Explanation:
     * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
     * <p>
     * Example 2:
     * <p>
     * Input: s = "azxxzy"
     * Output: "ay"
     *
     */
    private static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }

        }

        StringBuilder res = new StringBuilder();

        for (char ch : stack) {
            res.append(ch);
        }

        return res.reverse().toString();
    }

    /**
     * You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'
     * The input string s is valid if and only if:
     * Every open bracket is closed by the same type of close bracket.
     * Open brackets are closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     * Return true if s is a valid string, and false otherwise.
     */
    private static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case '(':
                case '{':
                case '[': {
                    stack.push(ch);
                }
                break;

                case ')': {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                break;

                case '}': {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                break;

                case ']': {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                break;


            }

        }

        return stack.isEmpty();
    }


    /**
     *
     * Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
     * <p>
     * return the next greater number for every element in nums.
     * <p>
     * The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,1]
     * Output: [2,-1,2]
     * <p>
     * Explanation: The first 1's next greater number is 2;
     * The number 2 can't find next greater number.
     * The second 1's next greater number needs to search circularly, which is also 2.
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1,2,3,4,3]
     * <p>
     * Output: [2,3,4,-1,4]
     */
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {

            int current = nums[i % n];

            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            //add in result
            if (i < n) {
                result[i] = !stack.isEmpty() ? stack.peek() : -1;
            }

            stack.push(current);
        }

        return result;
    }

    /**
     * Given an array of integers temperatures represents the daily temperatures,
     * <p>
     * return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
     * <p>
     * If there is no future day for which this is possible, keep answer[i] == 0 instead.
     * <p>
     *
     */
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        result[n - 1] = 0;
        stack.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {

            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            //add in result
            if (stack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return result;
    }

    public static int[] nextGreaterElementsTwo(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            stack.push(nums[i]);
        }

        for (int i = n - 1; i >= 0; i--) {

            int current = nums[i];

            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            //add in result
            result[i] = !stack.isEmpty() ? stack.peek() : -1;

            stack.push(current);
        }

        return result;
    }

}
