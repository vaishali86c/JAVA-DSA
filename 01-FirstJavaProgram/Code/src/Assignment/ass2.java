package Assignment;

import java.util.Scanner;

// take name as input ans print a greeting message for that particular name
public class ass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String ans = input.nextLine();

        System.out.println("Greeting "+ans);


    }
}
