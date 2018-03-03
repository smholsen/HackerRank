package Practice.DataStructures.LinkedLists.ReverseADoublyLinkedList;

public class Solution {

    /*
    Insert Node at the end of a linked list
    head pointer input could be NULL as well for empty list
    Node is defined as
    */
    class Node {
        int data;
        Node next;
        Node prev;
    }

    Node Reverse(Node head) {
        if (head == null) return null;
        Node current = head.next;
        Node prev = head;
        head.next = null;

        while (current != null) {
            Node tmp = current.next;
            current.next = prev;
            prev.prev = tmp;
            prev = current;
            current = tmp;
        }

        return prev;
    }

}
