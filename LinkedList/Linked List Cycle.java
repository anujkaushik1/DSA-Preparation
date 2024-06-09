/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         if(head == null || head.next == null){
             return false;
         }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

             if(slow == fast){
                return true;
            }
        }


        return false; // linear h koe bhi loop nai h

    }
}


public class Solution {
    public boolean hasCycle(ListNode head) {
          ListNode temp = head;
         if(temp == null || temp.next == null){
             return false;
         }

         HashMap<ListNode, Boolean> hashMap= new HashMap<>();

         while(temp != null){
             if(hashMap.containsKey(temp)){
                 return true;
             }
             hashMap.put(temp, true);
             temp = temp.next;
         }

         return false;
    }
}
