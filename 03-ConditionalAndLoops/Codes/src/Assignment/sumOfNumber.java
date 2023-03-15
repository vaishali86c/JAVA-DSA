package Assignment;
//take  integer input till the user enter 0 and print sum of all numbers
import java.util.Scanner;

public class sumOfNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many  numbers you want ");
        int number = input.nextInt();

        while (number > 0) {
            for (int i = 1; i <= number; i++) {
                System.out.println("enter the  number  :");
                int num = input.nextInt();
                sum = sum + num;


                if (number == 0) {
                    break;
                }
            }
            break;
        }

        System.out.println("sum is " + sum);
    }

}

