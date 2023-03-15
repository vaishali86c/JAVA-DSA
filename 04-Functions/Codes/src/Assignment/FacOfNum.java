package Assignment;

public class FacOfNum {
    public static void main(String[] args) {
        fact(5);
    }
    static void fact(int num) {
        int fact = 1;
        for (int i = 1;i <= num;i++) {
            fact = fact * i;
        }
        System.out.println(" Facttorial of "+ num + " is " + fact);
    }
}
