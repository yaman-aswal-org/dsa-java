package dsa_patterns.utils;

import java.util.ArrayList;

public class LinkedListUtils {

    public static void printListInt(Node<Integer> node) {

        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }

        System.out.println();
    }

    public static void printListStr(Node<String> node) {

        while (node != null) {
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }

        System.out.println();
    }

    public static Node<Integer> createListInt(int[] list) {

        if (list == null || list.length == 0) {
            return null;
        }

        Node<Integer> head = new Node<>(list[0], null);
        Node<Integer> current = head;

        for (int i = 1; i < list.length; i++) {
            Integer data = list[0];
            current.next = new Node<>(data, null);
            current = current.next;
        }

        return head;
    }

    public static Node<String> createListStr(String[] list) {

        if (list == null || list.length == 0) {
            return null;
        }

        Node<String> head = new Node<>(list[0], null);
        Node<String> current = head;

        for (int i = 1; i < list.length; i++) {
            String data = list[i];
            current.next = new Node<>(data, null);
            current = current.next;
        }

        return head;
    }

    private static Node<String> insertNodeStrAtStart(Node<String> head, String data) {
        if (head == null) {
            return null;
        }

        Node<String> newNode = new Node<>(data, null);
        newNode.next = head;
        head = newNode;
        return head;
    }

}
