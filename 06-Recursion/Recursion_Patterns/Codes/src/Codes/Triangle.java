package Codes;

public class Triangle {
    public static void main(String[] args) {
        trianle(4,0);
    }
    static void trianle(int r,int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print(" *");
            trianle(r,c+1);
        }else {
            System.out.println();
            trianle(r-1,0);
        }
    }
}
