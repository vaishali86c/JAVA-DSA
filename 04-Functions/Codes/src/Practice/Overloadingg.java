package Practice;

public class Overloadingg {
    public static void main(String[] args) {
       int ans = sum(7,8);
        System.out.println(ans);
        int anss = sum(6,8,9);
        System.out.println(anss);
    }
    static int sum(int a,int b) {
        return a + b;
    }
    static int sum(int a,int b,int c) {
        return a + b + c;
    }
}
