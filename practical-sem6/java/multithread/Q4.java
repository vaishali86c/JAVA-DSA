import java.util.*;
import java.io.*;


class PrintText_Thread extends Thread {

    String text;
    int n;

    public PrintText_Thread(String text, int n) {
        this.text = text;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < this.n; i++) {
            System.out.println(this.text);
        }
    }
}

class Q4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of n :");
        int n = in.nextInt();

        System.out.println("Enter the text for THread 1 : ");
        String t1 = in.next();

        System.out.println("Enter the text for Thread 2 : ");
        String t2 = in.next();

        System.out.println("Enter the text for Thread 3 : ");
        String t3 = in.next();

        Thread thread1 = new Thread(new PrintText_Thread(t1, n));
        Thread thread2 = new Thread(new PrintText_Thread(t2, n));
        Thread thread3 = new Thread(new PrintText_Thread(t3, n));

        System.out.println("\n\n");

        thread1.start();
        thread2.start();
        thread3.start();




    }
}