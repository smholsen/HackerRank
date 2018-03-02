package Practice.DataStructures.LinkedLists.CompareTwoLinkedLists;

public class Solution {
    /*
    Compare two linked lists A and B
    Return 1 if they are identical and 0 if they are not.
    Node is defined as
    */

    class Node {
        int data;
        Node next;
    }

    int CompareLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        while (headA != null || headB != null) {
            if (headA == null && headB != null) return 0;
            else if (headB == null && headA != null) return 0;
            else {
                if (headA.data != headB.data) return 0;
                else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
        }
        return 1;

    }
}
