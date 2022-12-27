package Assignment;

import java.util.Scanner;

//take in two number and an operator (+,-,*,/) and calculate the value.(use if conditions)
public class ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        System.out.println("Enter the character you want to  perform:");
        char op = sc.next().charAt(0);
        solve(a , b ,op);



    }
    static int  solve(int a,int b,char op) {
        int ans = 0;
        //addition
        if (op == '+') {
            ans = a + b;
        }
        //sub
        if (op == '-') {
            ans = a - b;
        }
        //multiply
        if (op == '*') {
            ans = a * b;
        }
        //divide
        if (op == '/') {
            ans = a / b;
        }
        System.out.println("ans is "+ans);
        return ans;
    }
}
