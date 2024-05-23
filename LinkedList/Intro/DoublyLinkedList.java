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

        nn.next = this.head;
        this.head = head;

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


}
