package Practice;

public class DigitsSum {
    public static void main(String[] args) {
        int ans = digitSum(1234);
        System.out.println(ans);
    }
    static int digitSum (int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n/10);
    }
}
