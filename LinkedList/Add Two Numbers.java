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
        public ListNode addTwoLinkedList2(ListNode l1, ListNode l2){
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode ans = new ListNode(-1);
        ListNode ansHead = ans;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int sum = (temp1 == null ? 0 : temp1.val) + (temp2 == null ? 0 : temp2.val) + carry;

            int rem = sum % 10;
            int quo = sum / 10;

            carry = quo;

            ListNode addingNode = new ListNode(rem);
            ans.next = addingNode;
            ans = addingNode;

            if(temp1 != null){
                temp1 = temp1.next;
            }
            if(temp2 != null){
                temp2 = temp2.next;
            }
        }

        if(carry > 0){
            ListNode addingNode = new ListNode(carry);
            ans.next = addingNode;
            ans = addingNode;
        }

        return ansHead.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoLinkedList2(l1, l2);
    }
}
