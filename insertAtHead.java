/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node newn = new Node(x);
        newn.next = head;
        return newn;
    }
}

// https://www.geeksforgeeks.org/problems/linked-list-insertion-at-beginning/1
