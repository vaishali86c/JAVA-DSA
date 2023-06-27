package practice;

public class recursion1 {
    public static void main(String[] args) {
        function(5);
    }

    static int function(int n) {

        if (n == 0) {
            return 1;
        }
        System.out.println(n);

        return function(n-1);
    }
}
