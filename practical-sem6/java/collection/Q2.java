import java.util.*;
import java.io.*;

public class Q2 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        LinkedList<String> l1 = new LinkedList<>();
        LinkedList<String> l2 = new LinkedList<>();
        LinkedList<String> l3 = new LinkedList<>();
        LinkedList<String> l4 = new LinkedList<>();

        System.out.println("Enter the number of element in list 1: ");
        
        String ch;
        String data;

        do {
            System.out.println("Enter the element : ");
            data = in.next();

            while (l1.contains(data)) {
                System.out.println("Duplicate element are not allowed \n Enter again : ");
                data = in.next();        
            }
            System.out.println("do you want to continue : ");

            ch = in.next();
            l1.add(data);

        } while (ch.equals("Y") || ch.equals("y"));

        System.out.println(l1);
    
        System.out.println("Enter the number of element in list 2: ");        

        do {
            System.out.println("Enter the element : ");
            data = in.next();

            while (l2.contains(data)) {
                System.out.println("Duplicate element are not allowed \n Enter again : ");
                data = in.next();        
            }
            System.out.println("do you want to continue : ");

            ch = in.next();
            l2.add(data);

        } while (ch.equals("Y") || ch.equals("y"));

        System.out.println(l2);

        while (true) {
            System.out.println("1.union");
            System.out.println("2.intersection");
            System.out.println("3.exit");
            int option = in.nextInt();

            switch (option) {
                case 1:
                        for (int i = 0; i < l1.size(); i++) {
                            l3.add(l1.get(i));
                        }

                        for (int i = 0; i < l2.size(); i++) {
                            if (!l3.contains(l2.get(i))) {
                                l3.add(l2.get(i));
                            }
                        }
                        System.out.println("Union :" + l3);
                        break;
                case 2: 
                        for (int i = 0; i < l1.size(); i++) {
                            l4.add(l1.get(i));
                        }
                        l4.retainAll(l2);
                        System.out.println("Intersection : " + l4);
                        break;
                case 3:
                        System.exit(0);
                
            }

        }
    }
}
