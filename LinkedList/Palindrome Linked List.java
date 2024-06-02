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
        public ListNode recursiveReverse(ListNode head){
         if(head == null || head.next == null){
             return head;
         }

         ListNode newHead = recursiveReverse(head.next);
         ListNode front = head.next;
         front.next = head;
         head.next = null;

         return newHead;

    }

    public boolean isPalindrome(ListNode head) {
           if(head == null){
             return false;
         }

         if(head.next == null){
             return true;
         }

         ListNode slow = head, fast = head;

         while (fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
         }

         ListNode newHead = recursiveReverse(slow);

         ListNode tailMover = newHead;
         ListNode headMover = head;

         boolean isPalidrome = true;

         while (tailMover != null){
             if(tailMover.val != headMover.val){
                 isPalidrome = false;
             }

             tailMover = tailMover.next;
             headMover = headMover.next;
         }

         recursiveReverse(newHead);
         return isPalidrome;
    }
}
