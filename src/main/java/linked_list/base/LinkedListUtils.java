package linked_list.base;

import java.util.ArrayList;

public class LinkedListUtils {

    public static void printListInt(Node<Integer> node){

        while (node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }

        System.out.println();
    }

    public static void printListStr(Node<String> node){

        while (node != null){
            if (node.next != null){
                System.out.print(" -> ");
            }
            node = node.next;
        }

        System.out.println();
    }

    public static Node<Integer> createListInt(ArrayList<Integer> list){

        if (list == null || list.isEmpty()) {
            return null;
        }

        Node<Integer> head = new Node<>(list.get(0), null);
        Node<Integer> current = head;

        for (int i = 1; i < list.size(); i++) {
            Integer data = list.get(i);
            current.next = new Node<Integer>(data, null);
            current = current.next;
        }

        return head;
    }

    public static Node<String> createListStr(ArrayList<String> list){

        if (list == null || list.isEmpty()) {
            return null;
        }

        Node<String> head = new Node<>(list.get(0), null);
        Node<String> current = head;

        for (int i = 1; i < list.size(); i++) {
            String data = list.get(i);
            current.next = new Node<String>(data, null);
            current = current.next;
        }

        return head;
    }

}
