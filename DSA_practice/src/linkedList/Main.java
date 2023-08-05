package linkedList;

import jdk.dynalink.linker.LinkerServices;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.insertFirst(6);
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(18);
//        list.insertLast(99);
//        list.insertAtIndex(78,2);
//        list.display();
//        System.out.println();
//        System.out.println(list.deleteFirst());
//        System.out.println();
//        list.display();
//        System.out.println();
//        System.out.println(list.deleteLast());
//
//        list.display();
//        System.out.println();
//        System.out.println(list.deleteAtIndex(2));
//        list.display();

//        DLL list = new DLL();
//
//        list.insertFirst(7);
//        list.insertFirst(6);
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertLast(99);
//        list.insertAfter(4,65);
//        list.display();

        CLL list = new CLL();

        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);

        list.delete(19);
        list.display();

    }
}
