package Practice.DataStructures.LinkedLists.InsertingANodeIntoASortedDoublyLinkedList;

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


    private void insertNode(Node prev, Node newNode, Node next) {
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = next;
        if (next != null) next.prev = newNode;
    }

    Node SortedInsert(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) return newNode;
        Node prev = head;
        Node current = head.next;
        while (current != null) {
            if (current.data > data) {
                insertNode(prev, newNode, current);
                return head;
            } else {
                prev = current;
                current = current.next;
            }
        }
        insertNode(prev, newNode, null);
        return head;
    }

}
