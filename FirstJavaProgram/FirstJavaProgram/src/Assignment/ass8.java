package Assignment;

import java.util.Scanner;

public class ass8 {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("Enter the string :");
        String name = string.nextLine();
        if (isPallindrome(name)) {
            System.out.println(name+" is a pallindrome string");
        }
        else {
            System.out.println(name+" is not a pallindrome string");
        }

    }
    static boolean isPallindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) !=str.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
