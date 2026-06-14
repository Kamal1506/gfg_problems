/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        if(head == null || k == 1) return null;
        Node curr = head;
        Node prev = null;
        int count = 1;
        while(curr != null){
            if(count == k){
                prev.next = curr.next;
                count = 1;
                curr = curr.next;
            }
            else{
                prev = curr;
                curr = curr.next;
                count++;
            }
        }
        return head;
    }
}
https://www.geeksforgeeks.org/problems/remove-every-kth-node/1
