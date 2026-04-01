package dsa_patterns;

import dsa_patterns.utils.LinkedListUtils;
import dsa_patterns.utils.Node;

import java.util.ArrayList;

public class LinkedListQuestions {

    /* Reverse a Linked List - Using Three Pointers */
    public static Node<String> reverseALinkedList(Node<String> head) {

        Node<String> prev = null, next, curr = head;

        while (curr != null){

            // Store next
            next = curr.next;

            // Reverse current node's next pointer
            curr.next = prev;

            // Move pointers one position ahead
            prev = curr;
            curr = next;
        }

        return prev;
    }


    public static void main(String[] args) {
        String[] nums = new String[]{"1", "4", "4"};
        Node<String> head = LinkedListUtils.createListStr(nums);
        head = LinkedListQuestions.reverseALinkedList(head);
        LinkedListUtils.printListStr(head);
    }




}
