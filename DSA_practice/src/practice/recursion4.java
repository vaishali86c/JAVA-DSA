package practice;

public class recursion4 {
    public static void main(String[] args) {
        int ans = func(5);
        System.out.println(ans);
    }


    static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return  n + func(n-1);
    }
}
