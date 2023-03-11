package practice;
//given a number n find it is odd or even
public class evenOdd {
    public static void main(String[] args) {
        int n = 66;
        System.out.println(isOdd(n));
    }

     private static boolean isOdd(int n) {
        return (n & 1) == 1;
     }
}
