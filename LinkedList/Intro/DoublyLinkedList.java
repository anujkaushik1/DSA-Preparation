package LinkedList;

public class DoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }
    private Node head;
    public void addLast(int data){
        if(this.head == null){
            addFirst(data);
            return;
        }

        Node nn = new Node(data);
        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }

        nn.prev = temp;
        temp.next = nn;
    }

    public void addFirst(int data){
        Node nn = new Node(data);
        if(head == null){
            this.head = nn;
            return;
        }

        head.prev = nn;
        nn.next = this.head;
        this.head = nn;


    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print("Curr: " + temp.data);
            if(temp.prev != null){
                System.out.print("Prev: " + temp.prev.data);
            }
            System.out.print("   -------  ");
            if(temp.next != null){
                System.out.print("Next: " + temp.next.data);
            }
            temp = temp.next;
            System.out.println();
        }
    }

    public void insertAtIndex(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        for(int i = 0; i < idx - 1; i++){
            if(temp.next == null){
                addLast(data);
                return;
            }
            temp = temp.next;
        }

        Node nn = new Node(data);
        temp.next.prev = nn;
        nn.next = temp.next;
        nn.prev = temp;
        temp.next = nn;
    }

    public void removeFirst(){
        if(head == null){
            return;
        }

        if(this.head.next == null){
            this.head = this.head.next;
            return;
        }

        this.head = this.head.next;
        this.head.prev = null;

    }

    public void removeLast(){
        if(this.head == null){
            return;
        }

        if(this.head.next == null){
            removeFirst();
            return;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
    }

    public void removeAt(int idx){
        if(idx < 0){
            return;
        }

        if(idx == 0){
            removeFirst();
            return;
        }

        Node temp = head;

        for(int i = 0; i < idx - 1; i++){
            if(temp.next == null){
                return;
            }
            temp = temp.next;
        }

        if(temp.next == null){
            return;
        }

        if(temp.next.next == null){
            temp.next = null;
            return;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

}
