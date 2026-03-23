class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        if(pos == 1){
            Node x = new Node(val);
            x.next = head;
            return x;
        }
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == pos-1){
                Node x = new Node(val);
                x.next = temp.next;
                temp.next = x;
                return head; 
            }
            temp = temp.next;
        }
        return head;
    }
}

// https://www.geeksforgeeks.org/problems/insertion-at-a-given-position-in-a-linked-list/1
