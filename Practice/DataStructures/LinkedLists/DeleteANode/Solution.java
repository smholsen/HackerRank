package Practice.DataStructures.LinkedLists.DeleteANode;

public class Solution {
    /*
    Delete Node at a given position in a linked list
    head pointer input could be NULL as well for empty list
    Node is defined as
    */
    class Node {
        int data;
        Node next;
    }

    // This is a "method-only" submission.
    // You only need to complete this method.

    Node Delete(Node head, int position) {
        Node currentNode = head;
        if (position == 0) {
            return head.next;
        }
        Node previousNode = head;
        int currentPosition = 1;
        while (currentPosition <= position) {
            currentNode = currentNode.next;
            if (currentPosition == position) {
                previousNode.next = currentNode.next;
                return head;
            }
            previousNode = currentNode;
            currentPosition++;
        }
        return null;
    }
}
