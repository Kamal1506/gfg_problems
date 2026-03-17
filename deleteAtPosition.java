// User function Template for Java

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete {
    Node deleteAtPosition(Node head, int pos) {
        // your code here
        if(head == null) return null;
        if(pos == 1){
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node prev = null;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == pos){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}


// practice in : https://www.geeksforgeeks.org/problems/linked-list-delete-at-position/1
