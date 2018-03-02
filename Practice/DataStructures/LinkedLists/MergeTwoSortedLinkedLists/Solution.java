package Practice.DataStructures.LinkedLists.MergeTwoSortedLinkedLists;

public class Solution {
/*
Merge two linked lists
head pointer input could be NULL as well for empty list
Node is defined as
*/
    class Node {
        int data;
        Node next;
    }

    Node mergeLists(Node headA, Node headB) {
        Node head = null;
        Node prev = null;

        if (headA == null && headB == null) {
            return null;
        } else if (headA == null) {
            return headB;
        } else if (headB == null) {
            return headA;
        }

        if (headA.data < headB.data) {
            head = headA;
            headA = headA.next;
        } else {
            head = headB;
            headB = headB.next;
        }
        prev = head;
        while (headA != null && headB != null) {
            Node next = null;
            if (headA.data < headB.data) {
                prev.next = headA;
                headA = headA.next;
            } else {
                prev.next = headB;
                headB = headB.next;
            }
            prev = prev.next;
        }

        if (headA == null) {
            prev.next = headB;
        } else {
            prev.next = headA;
        }
        return head;
    }

}
