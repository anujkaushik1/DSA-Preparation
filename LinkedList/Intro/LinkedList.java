package LinkedList;

public class LinkedList {

     class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node head;

     public void display(){
        Node temp = this.head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

   protected void addFirst(int data){
         if(head == null){
             Node firstNode = new Node(data);
             this.head = firstNode;
             return;
         }
         Node firstNode = new Node(data);
         firstNode.next = this.head;
         this.head = firstNode;
    }

    public void addLast(int data){
         if(this.head == null){
             addFirst(data);
             return;
         }
         Node lastNode = new Node(data);
         Node temp = head;

         while(temp.next != null){
             temp = temp.next;
         }

         temp.next = lastNode;
    }

    void insertAtIndex(int data, int idx){

         if(idx == 0){
             addFirst(data);
             return;
         }

         Node newNode = new Node(data);
         Node temp = head;
         int counter = 0;

         while(temp != null){
            if(counter == idx - 1){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }

            counter++;
            temp = temp.next;
         }

//        for(int i = 0; i < idx - 1; i++){
//            temp = temp.next;
//        }
//
//        newNode.next = temp.next;
//        temp.next = newNode;
    }

    int removeFirst(){
         int data = this.head.data;
         this.head = this.head.next;
         return data;
    }

    int removeLast(){

         Node temp = head;

         if(temp == null){
             return -1;
         }

         if(temp.next == null){
             int data = temp.data;
             return data;
         }

         while(temp.next.next != null){
             temp = temp.next;
         }
         int data = temp.data;
         temp.next = null;

         return data;
    }

    int removeAt(int idx){

         if(idx < 0){
             return -1;
         }

        if(idx == 0){
            return removeFirst();
        }
        Node temp = head;
        for(int i = 0; i < idx - 1; i++){
            if(temp.next == null){    // idx > length
                break;
            }
            temp = temp.next;
        }


        if(temp.next == null){   // loop nai chla and (idx > length)
            return -1;
        }
        int data = temp.next.data;
        temp.next = temp.next.next;
        return data;

    }
}
