/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

 public class Solution
 {
     public static Node insertBeforeTail(Node list, int K) {
         // Write your code here
         if(list == null){
             return new Node(K);
         }
         if(list.next == null){
             Node newn = new Node(K);
             newn.next = list;
             list.prev = newn;
             newn.prev = null;
             return newn;
         }
         Node temp = list;
         while(temp.next != null){
             temp = temp.next;
         }
         Node back = temp.prev;
         Node newNode = new Node(K,temp,back);
         back.next = newNode;
         temp.prev = newNode;
         return list;
     }
 }

// https://www.naukri.com/code360/problems/insert-at-end-of-doubly-linked-list_10491197?leftPanelTabValue=PROBLEM


