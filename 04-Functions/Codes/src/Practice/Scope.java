package Practice;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        random();
    }
    static void random() {
        int num = 40;               //scope--you can only use this thing inside the functions
        System.out.println(num);
    }
}
