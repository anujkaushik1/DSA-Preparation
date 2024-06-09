
o(n)
public void deleteMidNode(Node head){

         Node slow = null;
         Node fast = head;

         while (fast != null && fast.next != null){
             if(slow == null){
                 slow = head;
             }
             else {
                 slow = slow.next;
             }
             fast = fast.next.next;

         }

         slow.next = slow.next.next;

    }
