package praticeRec;

public class sum {
    public static void main(String[] args) {
        int ans = fun(5);
        System.out.println(ans);
    }

    static int fun(int n) {
        if (n == 0) {
            return 0;
        }
        return n + fun(n-1);
    }
}
