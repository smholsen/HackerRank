package Practice.DataStructures.LinkedLists.CycleDetection;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /*
    Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
    A Node is defined as:
    */
    class Node {
        int data;
        Node next;
    }


    boolean hasCycle(Node head) {
        Set<Node> visitedNodes = new HashSet<>();
        if (head == null) {
            return false;
        }
        while (head != null) {
            if (visitedNodes.contains(head)) {
                return true;
            }
            visitedNodes.add(head);
            head = head.next;
        }
        return false;
    }

}
