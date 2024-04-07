package practice2;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
//    insert first element in the beginning

    public void insertElementFirst(int val) {

        Node node = new Node(val);

        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size += 1;

    }

//    insertelementatLast

    public void insertelementatLast(int val) {
        if (tail == null) {
            insertElementFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

//    insert element at particular index

    public void insertelementAtindex(int val, int index) {

        if (index == 0) {
            insertElementFirst(val);
            return;
        }

        if (index == size) {
            insertelementatLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }
//    display the linked list
    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("END");
    }












    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
