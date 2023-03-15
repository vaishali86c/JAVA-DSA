package Assignment;

import java.util.Scanner;

public class sumOfDigitsOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 2345;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("sum is " + sum);
    }
}
