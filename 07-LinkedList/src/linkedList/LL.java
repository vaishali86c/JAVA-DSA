package linkedList;

public class LL {


    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = size;
    }

    //insert first

     public void insertFirst (int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    //value at a particular index

    public void insertAtIndex (int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size += 1;
    }

    public int deleteFirst () {
        int value = head.val;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return value;

    }

    public int deleteLast () {
        //list empty
        if (head == null) {
            return -1;
        }
        //one element
        if (head == tail) {
            int value = head.val;
            head = tail = null;
            size--;
            return value;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        int value = tail.val;
        temp.next = null;
        tail = temp;
        size--;
        return value;

    }

    public int deleteAtIndex (int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        int value = temp.next.val;

        temp.next = temp.next.next;
        if (temp.next ==  null) {
            tail = temp;
        }
        size--;
        return value;
    }


    public Node find (int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display () {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("end");
    }

    public void insertLast (int value) {
        Node node = new Node(value);

        tail.next = node;
        tail = node;
        size += 1;

        if (tail == null) {
            insertFirst(value);
            return;
        }
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}
