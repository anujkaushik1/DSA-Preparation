ITERATIVE ========
class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode last = null;
         ListNode curr = head;
         while(curr != null){

             ListNode temp = curr.next;
             curr.next = last;
             last = curr;
             curr = temp;

         }
         
         return last;
    }
}

RECURSIVE ===
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
         if(head == null || head.next == null){
             return head;
         }

         ListNode newHead = reverseList(head.next);
         ListNode front = head.next;
         front.next = head;
         head.next = null;
         
         return newHead;
    }
}
