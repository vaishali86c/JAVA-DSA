package praticeRec;

public class rec2 {
    public static void main(String[] args) {
        fuc(5);
    }

    static void fuc(int n) {
        if (n == 0) {
            return;
        }
        fuc(n-1);
        System.out.println(n);
    }
}
