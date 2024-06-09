package Stacks;

public class StackUsingLinkedList {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node head;
    // O(1)
    public int push(int data){
        Node nn = new Node(data);
        if(head == null){
            this.head = nn;
            return this.head.data;
        }

        nn.next = this.head;
        this.head = nn;
        return this.head.data;
    }
    // O(1)

    public int pop(){
        if(this.head == null){
            return -1;
        }
        Node ans = this.head;
        this.head = this.head.next;
        return ans.data;
    }
    // O(N)

    public void display(){
        Node mover = this.head;
        while(mover != null){
            System.out.println(mover.data);
            mover = mover.next;
        }
    }
    // O(1)

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }

        return false;
    }
    // O(1)

    public int peek(){
        if(this.head == null){
            return -1;
        }

        return this.head.data;
    }
}
