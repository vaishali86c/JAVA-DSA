package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class InputUsingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0;i < arr.length;i++) {
            System.out.println("enter the value :");
            arr[i] = input.nextInt();
        }
        System.out.println("Given array is " + (Arrays.toString(arr)));
    }
}
