package linked_list;

import linked_list.base.LinkedListUtils;
import linked_list.base.Node;

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

        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Node<String> head = LinkedListUtils.createListStr(list);
        head = LinkedListQuestions.reverseALinkedList(head);
        LinkedListUtils.printListStr(head);
    }




}
