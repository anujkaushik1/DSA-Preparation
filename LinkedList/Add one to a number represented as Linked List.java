/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    // head2 is greater
    public ListNode collisionPoint(ListNode head1, ListNode head2, int mover){
        
        while(head2!= null && mover != 0){
            head2 = head2.next;
            mover--;
        }

        while(head1 != null){
            
            if(head1 == head2){
                return head1;
            }

            head1 = head1.next;
            head2 = head2.next;
        }
        return null;

    }

    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        int length1 = 0;
        while(temp1 != null){
            length1++;
            temp1 = temp1.next;
        }

        ListNode temp2 = head2;
        int length2 = 0;
        while(temp2 != null){
            length2++;
            temp2 = temp2.next;
        }

        if(length2 > length1){
            return collisionPoint(head1, head2, length2 - length1);
        }

        return collisionPoint(head2, head1, length1 - length2);


    }
}
















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

	    public static int add1ToLLRecurive(Node head){

         if(head == null){
             return 1;
         }

         int carry = add1ToLLRecurive(head.next);
         int rem = (head.data + carry) % 10;
         int quo = (head.data + carry) / 10;
         
         head.data = rem;

         carry = quo;

         return carry;
    }

	public static Node addOne(Node head) {
		
         if(head == null)
             return head;
         
         int carry = add1ToLLRecurive(head);
         if(carry > 0){
             Node firstNode = new Node(carry);
             firstNode.next = head;
             head = firstNode;
         }
         
         return head;
	}
}















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
