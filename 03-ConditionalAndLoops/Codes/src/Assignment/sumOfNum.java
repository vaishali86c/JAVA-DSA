package Assignment;

import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number you want :");
        int n = input.nextInt();

        for (int i = 1;i <= n;i++) {
            System.out.println("Enter the " + i + " number");
            int num = input.nextInt();
            sum = sum + num;

        }
        System.out.println("sum is :" + sum);
    }
}
