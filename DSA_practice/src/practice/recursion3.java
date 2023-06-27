package practice;

public class recursion3 {
    public static void main(String[] args) {
        int ans = func(5);
        System.out.println(ans);
    }


    static int func(int n) {
        if (n == 1) {
            return 1;
        }
        return  n * func(n-1);
    }
}
