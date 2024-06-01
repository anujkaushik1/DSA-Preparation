
main(){  

   LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(3);

        LinkedList ans = ll.oddEvenLL(ll);
        ans.display();

}

    public LinkedList oddEvenLL(LinkedList l){   // SPACE - O(1), TIME - O(n/2)

         Node head = l.head;

         if(head == null || head.next == null){
             return l;
         }

         Node odd = head;
         Node even = head.next;
         Node evenHead = head.next;

         while(even != null){
             if(even.next == null){
                 break;
             }
             odd.next = odd.next.next;  // agar pehle (even.next = even.next.next;) yeh likhdete toh exception aajati because same ll hai and odd ka next depend krta h even ke next pr but vice versa koe dikkat nai h - dry run
             even.next = even.next.next;

             odd = odd.next;
             even = even.next;


         }

         odd.next = evenHead;

         return l;


    }


public LinkedList oddEvenLL(LinkedList l){  // SPACE - O(n), TIME - O(n)

         Node head = l.head;

         LinkedList groupLL = new LinkedList();
         Node dummyOdd = new Node(-1);
         Node tempOdd = dummyOdd;
         Node dummyEven = new Node(-1);
         Node tempEven = dummyEven;

         int counter = 1;

         while(head != null){
             Node nn = new Node(head.data);
             if(counter % 2 == 0){
                 tempEven.next = nn;
                 tempEven = tempEven.next;
             }
             else{
                 tempOdd.next = nn;
                 tempOdd = tempOdd.next;
             }

             counter++;
             head = head.next;
         }

         tempEven.next = dummyOdd.next;

         groupLL.head = dummyEven.next;

         return groupLL;

    }
