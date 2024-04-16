import java.util.*;
import java.io.*;

class q11 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>();

        System.out.println("Enter the number of persons : ");
        int n = in.nextInt();

        for (int i = 0 ; i < n ; i++) {
            System.out.println("Enter the name of person :" + (i + 1));
            String pname = in.next();

            System.out.println("Enter the number of person:" + (i + 1));
            String pno = in.next();

            map.put(pname, pno);
        }

        System.out.println(map.keySet());

        System.out.println("Enter the person name whose number you want: ");
        String name = in.next();

        if (map.containsKey(name)) {
            System.out.println("Number is :" + map.get(name));
        } else {
            System.out.println("No Such name exist !");
        }

    }
}