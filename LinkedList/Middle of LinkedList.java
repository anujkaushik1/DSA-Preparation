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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int length = 0;

        while(temp != null){
            temp = temp.next;
            length++;
        }

        int n = (length / 2) + 1;
        temp = head;

        for(int i = 1; i < n; i++){
            temp = temp.next;
        }

        return temp;
    }
}
