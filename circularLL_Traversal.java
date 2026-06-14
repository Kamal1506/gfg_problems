/* Node of a linked list
 class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }

}
*/

class Solution {
    /* Function to print nodes in a given Circular linked list */
    void printList(Node head) {
        // Your code here
        Node temp = head;
        if(head != null)
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp != head);
    }
}

http://geeksforgeeks.org/problems/circular-linked-list-traversal/1
