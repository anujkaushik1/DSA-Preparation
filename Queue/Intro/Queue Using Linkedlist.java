package Queue;

public class QueueUsingLinkedList {
    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    // O(1)
    public int enqueue(int data){
        Node nn = new Node(data);
        if(this.head == null){
            this.head = this.tail = nn;
            return this.head.data;
        }

        this.tail.next = nn;
        this.tail = nn;
        return this.tail.data;
    }
    // O(1)
    public int dequeue(){
        if(this.head == null){
            return -1;
        }

        int ans = this.head.data;
        this.head = this.head.next;
        return ans;
    }
}
