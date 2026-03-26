/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        int count = 0;
        Node temp = head;
        while(temp.next != null){
            if(count == p) break;
            temp = temp.next;
            count++;
        }
        Node newNode = new Node(x);
        if(temp.next == null){
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;
            return head;
        }
        Node front = temp.next;
        newNode.prev = temp;
        newNode.next = front;
        temp.next = newNode;
        front.prev = newNode;
        return head;
    }
}

// https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1

