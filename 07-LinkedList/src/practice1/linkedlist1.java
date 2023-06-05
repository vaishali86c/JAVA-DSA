package practice1;

public class linkedlist1 {


    private Node head;
    private Node tail;

    private int size;

    public void linkedlist1() {
        this.size = 0;
    }


    private class Node {

        private int value;

        private Node next;

        private void Node(int value) {
            this.value = 0;
        }

        private void Node (int value,Node next){
            this.value = 0;
            this.next = next;

        }
    }
}
