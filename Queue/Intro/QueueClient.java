package Queue;

public class QueueClient {
    public static void main(String[] args) {
        QueueUsingLinkedList qu = new QueueUsingLinkedList();
        System.out.println(qu.dequeue());
        System.out.println(qu.dequeue());
        System.out.println(qu.enqueue(20));
        System.out.println(qu.enqueue(80));
        System.out.println(qu.enqueue(100));
        System.out.println(qu.enqueue(120));
        System.out.println(qu.enqueue(140));
        System.out.println("---------------");
        System.out.println(qu.dequeue());
        System.out.println(qu.dequeue());
        System.out.println(qu.dequeue());
        System.out.println(qu.dequeue());
        System.out.println(qu.dequeue());
        System.out.println(qu.dequeue());

    }
}
