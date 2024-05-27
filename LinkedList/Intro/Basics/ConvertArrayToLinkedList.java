package LinkedList.Basics;

import LinkedList.LinkedList;
import LinkedList.DoublyLinkedList;

public class ConvertArrayToLinkedList {
    // o(n^2) time complexity => add last function is taking (**HERE WE HAVE TO USE CONCEPT OF DUMMY NODE TO CREATE LL IN O(1)
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,20};
        LinkedList ll = new LinkedList();
        DoublyLinkedList dl = new DoublyLinkedList();
        for(int val: arr){
            ll.addLast(val);
        }
        for(int val : arr){
            dl.addLast(val);
        }

        dl.display();

//        ll.display();
    }
}
