/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        int count = 0;
        Node temp = head;
        while(temp.next != null){
            count++;
            if(count == x){
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node front = temp.next;
        
        if(back == null && front == null){
            return null;
        }
        else if(back == null){
            Node curr = head;
            head = head.next;
            head.prev = null;
            curr.next = null;
            return head;
        }
        else if(front == null){
            Node tail = head;
            while(tail.next != null){
                tail = tail.next;
            }        
            Node temp1 = tail.prev;
            temp1.next = null;
            return head;
        }
        back.next = front;
        front.prev = back;
        temp.prev = null;
        temp.next = null;
        return head;
    }
}

//https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1
