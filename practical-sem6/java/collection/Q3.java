import java.util.*;
import java.io.*;

class Q3 {
    public static void main(String args[]) {

        Set<String> flavour = new HashSet<>();
        HashMap<String, Double> map = new HashMap<>();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numer of flavours: ");
        int n = in.nextInt();

        for (int i = 0 ; i < n; i++) {
            System.out.println("Enter the number flavour :" + (i + 1));
            String flv = in.next();
            while(flavour.contains(flv)) {
                System.out.println("Duplicate entry not allowed \n Enter again: ");
                flv = in.next();
            }
            flavour.add(flv);
        }
        System.out.println(flavour);

        for (String flv : flavour) {
            System.out.println("Enter the price of :" + flv);
            Double price = in.nextDouble();
            map.put(flv,price);
        }
        System.out.println(map);

        while (true) {
            System.out.println("1.Search for flavour:");
            System.out.println("2.Sort flavour");
            System.out.println("3.exit");

            System.out.println("Enter the option : ");
            int opt = in.nextInt();

            switch(opt) {
                case 1: 
                        System.out.println("Enter the flavour name you want to search : ");
                        String name = in.next();
                        if (map.containsKey(name)) {
                            System.out.println("Flavour found and price is " + map.get(name));
                        } else {
                            System.out.println("Flavour not found");
                        }
                        break;
                case 2:
                        ArrayList<String> list = new ArrayList<>(flavour);
                        Collections.sort(list);
                        System.out.println("Sorted : ");
                        System.out.println(list);
                        break;
                case 3:
                        System.exit(0);
            }
        }
    }
}