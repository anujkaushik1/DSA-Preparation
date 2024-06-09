package Stacks;

public class StackClient {
    public static void main(String[] args) {
        StackUsingLinkedList sl = new StackUsingLinkedList();
        System.out.println(sl.pop());
        System.out.println(sl.pop());
        System.out.println(sl.push(10));
        System.out.println(sl.push(20));
        sl.push(105);
        sl.push(125);
        sl.push(135);
        System.out.println();
        sl.display();
        System.out.println();
        System.out.println(sl.peek());
        System.out.println(sl.isEmpty());
    }
}
