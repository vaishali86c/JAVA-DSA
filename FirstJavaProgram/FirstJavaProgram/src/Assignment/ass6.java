package Assignment;

import java.util.Scanner;

//input currency in rupees and output in USD
public class ass6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency in rupees:");
        int rupee = input.nextInt();
        float usd = rupee * 0.012f;
        System.out.println("In USD "+usd);
    }
}
