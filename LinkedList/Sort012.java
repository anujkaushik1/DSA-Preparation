    public void sort012(LinkedList ll){

         Node head = ll.head;
         Node temp = head;

        Node dummy0 = new Node(-1);
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);

        Node head0 = dummy0;
        Node head1 = dummy1;
        Node head2 = dummy2;

        while(temp != null){

            if(temp.data == 0){
                dummy0.next = temp;
                dummy0 = dummy0.next;
            }
            else if(temp.data == 1){
                dummy1.next = temp;
                dummy1 = dummy1.next;

            }
            else{
                dummy2.next = temp;
                dummy2 = dummy2.next;

            }

            temp = temp.next;
        }

        dummy0.next = head1.next != null ? head1.next : head2.next;
        if(head1.next != null){  // agar 1 exist hi nai krta toh kyu krna (agr yeh condition hta bhi denge jabh bhi koe problem nai h)
            dummy1.next = head2.next;
        }
        dummy2.next = null;  // yeh issleye kr rhe h kyonki yeh new ll nai h whi h or same linkedlist ke andr nodes update kr rhe h or ho skta h woh kisi or node se connected ho toh usko expicitly null krna pdega
        ll.head = head0.next;

    }
