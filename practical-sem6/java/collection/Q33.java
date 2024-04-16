import java.util.*;
import java.io.*;

class Q33 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Set<String> flavour = new HashSet<>();
        HashMap<String, Double> map = new HashMap<>();

        System.out.println("Enter the number of flavours");
        int n = in.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Enter the flavour : "+ (i + 1));
            String flv = in.next();

            while(flavour.contains(flv)) {
                System.out.println("do not allowed duplicates\n Enter Again ");
                flv = in.next();
            }
            flavour.add(flv);
        } 
        System.out.println(flavour);

        for (String flv : flavour) {
            System.out.println("Enter the price :" + flv);
            Double price = in.nextDouble();
            map.put(flv, price);
        }
        System.out.println(map);

        while (true) {
            System.out.println("1.Seaerch for flavour");
            System.out.println("2. sort all falvours");
            System.out.println("3. exit");
            int opt = in.nextInt();
            
            switch(opt) {
                case 1:
                    System.out.println("Enter flavpour for search ");
                    String name = in.next();
                    
                    if (map.containsKey(name)) {
                        System.out.println("Found and price is :" + map.get(name));

                    } else {
                        System.out.println("Does not foundd");
                    }
                    break;
                case 2:
                    ArrayList<String> list = new ArrayList<>(flavour);
                    Collections.sort(list);
                    System.out.println("sorted is ");
                    System.out.println(list);
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }
}