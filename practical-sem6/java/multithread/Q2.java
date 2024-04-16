import java.util.*;
import java.io.*;



class Q2 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = in.nextInt();

        Thread t1 = new Thread(new MessagePrinter("Welcome to FY", n));
        Thread t2 = new Thread(new MessagePrinter("Welcome to SY", n));
        Thread t3 = new Thread(new MessagePrinter("Welcome to TY", n));

        t1.start();
        t2.start();
        t3.start();
    }
}

class MessagePrinter implements Runnable {

    String msg;
    int n;
    
    public MessagePrinter(String msg, int n) {
        this.msg = msg;
        this.n = n;
    }

    public synchronized void run() {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}