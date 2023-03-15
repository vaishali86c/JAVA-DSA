package Assignment;

public class Qus {
    public static void main(String[] args) {
        int ans = maximum(10,20,30);

        System.out.println("maximum element is " + ans);
        int anss = minimum(10,20,30);
        System.out.println("minimum element is " + anss);
    }
    public static int maximum(int a,int b,int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max;
    }

    public static int minimum(int a,int b,int c) {
        int min = a;

        if ( b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
