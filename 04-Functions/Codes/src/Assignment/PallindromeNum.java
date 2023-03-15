package Assignment;

public class PallindromeNum {
    public static void main(String[] args) {
        pall(22737);

    }
    static void pall(int num) {
        int num1 = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            num1 = num1 * 10 + rem;
            num = num / 10;
        }
        System.out.println(num1);
        if (temp == num1) {
            System.out.println("it is a pallindrome number");
        }else {
            System.out.println("it is not a pallindrome number ");
        }
    }
}
