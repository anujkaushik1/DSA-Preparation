import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/

public class Solution {

	    public static Node recursiveReverse(Node head){
         if(head == null || head.next == null){
             return head;
         }

         Node newHead = recursiveReverse(head.next);
         Node front = head.next;
         front.next = head;
         head.next = null;

         return newHead;

    }

	public static Node addOne(Node head) {
		         if(head == null)
             return head;

         Node newHead = recursiveReverse(head);
         Node headMover = newHead;
         int carry = 1;

         while (headMover != null){
            int rem = (headMover.data + carry) % 10;
            int quo = (headMover.data + carry) / 10;

            carry = quo;

            headMover.data = rem;
            headMover = headMover.next;

            if(carry == 0){
                break;
            }
         }

         recursiveReverse(newHead);

         if(carry > 0){
             Node firstNode = new Node(carry);
             firstNode.next = head;
             head = firstNode;
         }

         return head;
	}
}
