package Practice;

public class FactorialOfNum {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
    }

    static int factorial(int n) {
      //  int ans = 0;
        if (n <= 1) {
            return 1;
        }
        return  n * factorial(n-1);

    }
}
