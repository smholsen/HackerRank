package Practice.DataStructures.LinkedLists.InsertANodeAtTheHeadOfALinkedList;

public class Solution {
    /*
    Insert Node at the beginning of a linked list
    head pointer input could be NULL as well for empty list
    Node is defined as
    */
    class Node {
        int data;
        Node next;
    }

    // This is a "method-only" submission.
    // You only need to complete this method.

    Node Insert(Node head, int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        return newNode;
    }
}
