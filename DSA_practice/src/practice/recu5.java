package practice;
//sum of digits
public class recu5 {
    public static void main(String[] args) {
        int ans = func(1342);
        System.out.println(ans);
    }

    static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + func( n / 10);
    }
}
