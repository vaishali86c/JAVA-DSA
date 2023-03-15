package Assignment;

import java.util.Scanner;

public class avgOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float avg = 0;
        System.out.println("Enter the number you want : ");
        int n = input.nextInt();
         for (int i = 1;i <=n;i++) {
             System.out.println("Enter the " + i +  " number : ");
             int num = input.nextInt();
             avg = avg + num;
         }
         avg = avg / n;
         System.out.println(avg);




    }
}
