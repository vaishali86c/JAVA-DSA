import java.util.*;
import java.io.*;

class Prime extends Thread {

    public synchronized void run() {
            ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                prime.add(i);
            }
        }
        System.out.println("Prime numbers are : ");
        System.out.println(prime + "\n");
    }
}

class Palindrome extends Thread{
    public Palindrome() {

    }

    public synchronized void run() {
        ArrayList<Integer> pal = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int reverseNumber = 0;
            int orignalNumber = i;

            while(orignalNumber > 0) {
                int digit = orignalNumber % 10;
                reverseNumber = reverseNumber * 10 + digit;
                orignalNumber /= 10;
            }

            if (reverseNumber == i) {
                pal.add(i);
            }
        }
        System.out.println("Pallindrome numbers are :");
        System.out.println(pal + "\n");
    }
}

class Q3 {
    public static void main(String args[]) {

        Thread t1 = new Thread(new Prime());
        Thread t2 = new Thread(new Palindrome());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}