package Practice;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(pall(2002));
    }
    static int rev(int n) {
        int digit = (int)(Math.log(n)/Math.log(10)) + 1;

        return helper(n,digit);
    }
    static int helper(int n,int digit){
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digit-1)) + rev(n/10);
    }
    static boolean pall(int n) {
        return n == rev(n);
    }
}
