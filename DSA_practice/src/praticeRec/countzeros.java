package praticeRec;

public class countzeros {
    public static void main(String[] args) {

        System.out.println(count(3040500));
    }

    static int count(int n) {
        return helper(n,0);
    }
    static int helper(int n,int c) {
        if (n == 0) {
            return c;
        }
        //int cont = 0;
        int rem = n % 10;

        if (rem == 0) {
            return helper(n/10,c + 1);

        }
        return helper(n/10,c);


    }
}
