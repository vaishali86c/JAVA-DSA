package Practice;

public class Shadowing {
    static int x = 90;//this will shadowed in line 10
    //using two variables with same name with the scope is overlap

    public static void main(String[] args) {
        System.out.println(x);//90
        int x ;
        x = 40;
        System.out.println(x);//40
        fun();

    }
    static void fun() {
        System.out.println(x);
    }
}
