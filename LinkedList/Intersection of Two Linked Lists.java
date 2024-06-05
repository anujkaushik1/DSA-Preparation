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
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
         if(head1 == null || head2 == null){
             return null;
         }
         ListNode temp1 = head1;
         ListNode temp2 = head2;
         while(temp1 != temp2){
             
             
             temp1 = temp1.next;
             temp2 = temp2.next;
             
             if(temp1 == temp2){
                 return temp1;
             }

               if(temp1 == null){
                 temp1 = head2;
             }
             
             if(temp2 == null){
                 temp2 = head1;
             }
             
         }
         
         return temp1;
    }
}




public class Solution {

    // head2 is greater
    public ListNode collisionPoint(ListNode head1, ListNode head2, int mover){
        
        while( mover != 0){
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

        if(length2 >= length1){
            return collisionPoint(head1, head2, length2 - length1);
        }

        return collisionPoint(head2, head1, length1 - length2);


    }
}




public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1 == null || head2 == null) return null;
         ListNode move1 = head1;
        HashSet<ListNode> hash= new HashSet<>();
         while(move1 != null){
             hash.add(move1);
             move1 = move1.next;
         }

         ListNode move2 = head2;
         while (move2 != null){
             if(hash.contains(move2)){
                 return move2;
             }
             move2 = move2.next;
         }

         return null;
    }
}













