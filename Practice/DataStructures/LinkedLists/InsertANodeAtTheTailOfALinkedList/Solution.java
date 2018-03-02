package Practice.DataStructures.LinkedLists.InsertANodeAtTheTailOfALinkedList;

public class Solution {
    /*
    Insert Node at the end of a linked list
    head pointer input could be NULL as well for empty list
    Node is defined as
    */
    class Node {
        int data;
        Node next;
    }


    Node Insert(Node head, int data) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node currentNode = head;
        Node newNode = new Node();
        newNode.data = data;
        while (true) {
            if (currentNode.next != null) {
                currentNode = currentNode.next;
            } else {
                break;
            }
        }
        currentNode.next = newNode;
        return head;
    }
}
