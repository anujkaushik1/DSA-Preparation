package LinkedList.Basics;

import LinkedList.LinkedList;

public class ConvertArrayToLinkedList {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,20};
        LinkedList ll = new LinkedList();
        for(int val: arr){
            ll.addLast(val);
        }

        ll.display();
    }
}
