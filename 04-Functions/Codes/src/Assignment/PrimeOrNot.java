package Assignment;

public class PrimeOrNot {
    public static void main(String[] args) {
        boolean  a = isPrime(3);
        System.out.println(a);
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2;i < num;i++) {
            if (num % 2 == 0) {
                return false;
            }

        }
        return true;
    }
}
