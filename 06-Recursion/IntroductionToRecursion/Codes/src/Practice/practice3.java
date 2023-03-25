package Practice;
//base condition
public class practice3 {
    public static void main(String[] args) {
        printsum(1);
    }
    static void printsum(int n) {

        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printsum(n+1);
    }
}
