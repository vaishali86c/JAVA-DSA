package Assignment;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        sum(6);
    }
    static void sum(int num) {
        int sum = 0;

            for (int i = 1; i <= num; i++) {
                //int rem = num % 10;
                sum = sum + i;

            }
        System.out.println(sum);
    }
}
