package Assignment;

public class FactorOfNum {
    public static void main(String[] args) {
        int num = 60;
        System.out.println("Factor of number are:");
        for (int i = 1;i <= num;i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
