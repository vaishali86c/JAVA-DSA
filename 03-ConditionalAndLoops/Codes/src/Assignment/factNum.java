package Assignment;

import java.util.Scanner;

//factorial program in java
public class factNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 5;
        int fact = 1;

        for (int i = 1;i <= number;i++) {
            fact = fact * i;
        }
        System.out.println("factorial  of " + number + " is :" + fact);
    }
}
