package LinkedList;

public class DoublyLinkedListClient {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
//        dl.addFirst(10);
//        dl.addFirst(20);
//        dl.addFirst(30);
//        dl.addFirst(50);
//
//        dl.display();

        dl.addLast(10);
        dl.addLast(20);
        dl.addLast(30);
        dl.addLast(40);

//        dl.display();

//        dl.insertAtIndex(2, 80);
        dl.insertAtIndex(3, 80);

        dl.display();
        System.out.println();
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.removeFirst();

        dl.removeLast();
        dl.removeLast();
        dl.removeLast();
        dl.removeLast();
        dl.removeLast();
        dl.removeLast();

        System.out.println("----");
//        dl.display();

        DoublyLinkedList dl2 = new DoublyLinkedList();
        dl2.addLast(10);
        dl2.addLast(20);

        dl2.display();
        System.out.println();
        System.out.println("--------");
        dl2.removeAt(1);
        dl2.display();


    }
}
