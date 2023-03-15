package Assignment;
//program 1 --fibonacci series in java program
public class fiboSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3,count = 10;
        System.out.println(" Fibonacci series :");
        System.out.print( n1 + " " + n2);

        for (int i = 2;i<count;i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
