package Assignment;
//addition of two numbers
import java.util.Scanner;

public class addOfTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:");
        int num2 = input.nextInt();

        int sum = 0;

        sum = num1 + num2;

        System.out.println("sum is:" + sum);
    }
}
