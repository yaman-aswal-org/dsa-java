package dsa_patterns;

import dsa_patterns.utils.LinkedListUtils;
import dsa_patterns.utils.Node;

import static dsa_patterns.utils.BasicUtils.sumOfSquaresOfDigits;

public class C_SlowFastPointersPatterns {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 4};
        Node<Integer> head = LinkedListUtils.createListInt(nums);
        boolean value = linkedListCycle(head);
        System.out.println(value);
    }


    /**
     * <h2>Linked List Cycle</h2>
     * Given head, the head of a linked list, determine if the linked list has a cycle in it.
     * <p>
     * Return true if there is a cycle in the linked list. Otherwise, return false.
     * <p>
     * Do not modify the linked list.
     *
     */
    private static boolean linkedListCycle(Node<Integer> head) {

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //increase by 1
            fast = fast.next.next; //increase by 2

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    /**
     * <h2>Linked List Cycle II - Cycle Begins</h2>
     * Given the head of a linked list, return the node where the cycle begins.
     * <p>
     * If there is no cycle, return null.
     * <p>
     * Do not modify the linked list.
     *
     */
    public static Node<Integer> detectCycle(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next; //increase by 1
            fast = fast.next.next; //increase by 2

            if (slow == fast) {
                // Step 2: Find start of cycle
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow; // start of cycle
            }
        }

        return null; //no cycle
    }

    /**
     * <h2>Middle of the Linked List</h2>
     *
     */
    public static Node<Integer> middleNode(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //increase by 1
            fast = fast.next.next; //increase by 2
        }

        return slow;
    }

    /**
     * <h2>Find the Duplicate Number</h2>
     * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
     * <p>
     * There is only one repeated number in nums, return this repeated number.
     * <p>
     * You must solve the problem without modifying the array nums and using only constant extra space.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,3,4,2,2]
     * Output: 2
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [3,1,3,4,2]
     * Output: 3
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [3,3,3,3,3]
     * Output: 3
     */
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        //as we know cycle exist due to duplicate values.
        while (true) {
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];

            if (slow == fast) {
                slow = 0;

                while (slow != fast) {
                    slow = nums[slow];
                    fast = nums[fast];
                }

                return slow;
            }
        }

    }

    /**
     * <h1>Happy Number</h1>
     */
    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while (fast != 1) {
            slow = sumOfSquaresOfDigits(slow);
            fast = sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast));

            //enter cycle which is not equal to 1 (1 is happy number)
            if (slow == fast && slow != 1) {
                return false;
            }
        }

        return true;
    }

}
