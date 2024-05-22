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

     void display(){
         System.out.println("-------------");
        Node temp = this.head;

        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void addFirst(int data){
         Node firstNode = new Node(data);
         firstNode.next = this.head;
         this.head = firstNode;
    }
}
