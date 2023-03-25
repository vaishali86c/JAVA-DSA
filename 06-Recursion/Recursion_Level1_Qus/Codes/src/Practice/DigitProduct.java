package Practice;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = digitproduct(1234);
        System.out.println(ans);
    }
    static int digitproduct (int n) {
        if ( (n % 10) == n) {
            return n;
        }

        return (n % 10) * digitproduct(n/10);
    }
}
