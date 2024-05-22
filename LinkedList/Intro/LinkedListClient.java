package LinkedList;

public class LinkedListClient {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addFirst(80);
        ll.addFirst(70);
        ll.addFirst(60);
        ll.addFirst(50);

//        ll.display();

        ll.addLast(100);
        ll.addLast(200);
        ll.display();

//        ll.insertAtIndex(28, 7);
//        System.out.println();
//        ll.display();

//        ll.removeFirst();
//        ll.removeLast();
        System.out.println();
        System.out.println(ll.removeAt(2));
        System.out.println();
        ll.display();
    }
}
