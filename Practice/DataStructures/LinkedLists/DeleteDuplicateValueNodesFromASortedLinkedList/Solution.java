package Practice.DataStructures.LinkedLists.DeleteDuplicateValueNodesFromASortedLinkedList;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /*
    Node is defined as
    */
    class Node {
        int data;
        Node next;
    }

    // Ok, so the set is overkill, as you could simply just check the previous value as the
    // linked list is already sorted

    Node RemoveDuplicates(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if (head == null) return null;
        Set<Integer> values = new HashSet<>();
        values.add(head.data);
        Node current = head.next;
        Node prev = head;
        while (current != null) {
            if (values.add(current.data)) {
                prev.next = current;
                prev = current;
            } else {
                prev.next = null;
            }
            current = current.next;
        }

        return head;
    }

}
