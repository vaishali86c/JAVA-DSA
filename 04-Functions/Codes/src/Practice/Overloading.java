package Practice;

public class Overloading {
    public static void main(String[] args) {
        fun(7);
        fun(8,9);

    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(int a,int b) {
        System.out.println(a);
        System.out.println(b);
    }
}
