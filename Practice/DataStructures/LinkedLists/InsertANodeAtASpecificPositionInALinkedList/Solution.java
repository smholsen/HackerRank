package Practice.DataStructures.LinkedLists.InsertANodeAtASpecificPositionInALinkedList;

public class Solution {
    /*
    Insert Node at a given position in a linked list
    head can be NULL
    First element in the linked list is at position 0
    Node is defined as
    */

    class Node {
        int data;
        Node next;
    }


    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node newNode = new Node();
        newNode.data = data;
        Node currentNode = head;
        if (head == null) {
            return newNode;
        }
        if (position == 0) {
            newNode.next = head;
            return newNode;
        } else {
            int currentPosition = 1;
            Node previousNode = head;
            while (currentPosition <= position) {
                if (currentNode.next == null) {
                    // We are at the tail.
                    currentNode.next = newNode;
                    return head;
                } else {
                    currentNode = currentNode.next;
                    if (currentPosition == position) {
                        previousNode.next = newNode;
                        newNode.next = currentNode;
                    }
                    previousNode = currentNode;
                    currentPosition++;
                }
            }
            return head;
        }

    }

}
