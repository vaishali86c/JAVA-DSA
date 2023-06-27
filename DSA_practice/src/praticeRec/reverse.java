package praticeRec;

public class reverse {

    public static void main(String[] args) {
        rev(123456789);

    }


    static void rev(int n) {
        int sum = 0;
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        System.out.print(sum);
        rev(n/10);
    }

}
