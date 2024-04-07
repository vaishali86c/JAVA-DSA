import java.io.*;
import java.util.*;

class Q1 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of person: ");
        int n = in.nextInt();

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of person: " + (i + 1));
            String pname = in.next();

            System.out.println("Enter the number of that person: " + (i + 1));
            String pno = in.next();

            map.put(pname, pno);
        }

        System.out.println(map.keySet());

        System.out.println("Enter the name whose number you want : ");
        String name = in.next();

        if (map.containsKey(name)) {
            System.out.println("Number is : " + map.get(name));
        } else {
            System.out.println("No such name exists");
        }
    }
}