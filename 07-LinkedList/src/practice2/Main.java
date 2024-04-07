package practice2;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertElementFirst(3);
        list.insertElementFirst(4);
        list.insertElementFirst(9);
        list.insertElementFirst(10);
        list.display();
        System.out.println();
        list.insertelementatLast(22);
        list.display();
        System.out.println();
        list.insertelementAtindex(45, 3);
        list.display();
    }
}
