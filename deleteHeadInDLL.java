
/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}
*/

// Complete the function
class Solution {
    public static Node deleteHead(Node head) {
        // your code here
        if(head == null || head.next == null){
            return null;
        }
        Node curr = head;
        head = head.next;
        head.prev = null;
        curr.next = null;
        return head;
    }
}

// https://www.geeksforgeeks.org/problems/delete-head-of-doubly-linked-list/1
