package Practice.DataStructures.LinkedLists.FindMergePointOfTwoLists;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /*
    Find merge point of two linked lists
    head pointer input could be NULL as well for empty list
    Node is defined as
    */
    class Node {
        int data;
        Node next;
    }

    int FindMergeNode(Node headA, Node headB) {
        // Complete this function
        // Do not write the main method.
        Set<Node> nodes = new HashSet<>();

        while (headA != null || headB != null) {
            if (headA != null) {
                if (!nodes.add(headA)) {
                    return headA.data;
                } else {
                    headA = headA.next;
                }
            }
            if (headB != null) {
                if (!nodes.add(headB)) {
                    return headB.data;
                } else {
                    headB = headB.next;
                }
            }
        }
        return 0;
    }


}
