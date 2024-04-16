import java.util.*;
import java.io.*;


class q22 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList l3 = new LinkedList();
        LinkedList l4 = new LinkedList();

        // do not allow duplicates
        System.out.println("Enter the elements in list 1: ");

        String ch;
        String data;

        do {
            System.out.println("Enter the number : " );
            data = in.next();

            while(l1.contains(data)) {
                System.out.println("Do not allowed duplicates ! \n Enter Again :");
                data = in.next();
            }    
            System.out.println("do you want to contibue");

            ch = in.next();
            l1.add(data);

        } while (ch.equals("Y") || ch.equals("y"));


        System.out.println("Enter the elements in list 2 : ");
        do {
            System.out.println("Enter the number :");
            data = in.next();

            while(l2.contains(data)) {
                System.out.println("do not allowed duplicates \n Enter again :");
                data = in.next();
            }

            System.out.println("Do you want to continue ! ");
            ch = in.next();

            l2.add(data);
        } while(ch.equals("Y") || ch.equals("y"));

        System.out.println(l1);
        System.out.println(l2);

        while(true) {
                System.out.println("1.union");
                System.out.println("2.intersection");
                System.out.println("3.exit");
                int option = in.nextInt();
                switch(option) {
                case 1: 
                        for(int i = 0; i < l1.size(); i++) {
                            l3.add(l1.get(i));
                        }

                        for (int i = 0; i < l2.size(); i++) {
                            if(!l3.contains(l2.get(i))) {
                                l3.add(l2.get(i));
                            }
                        }
                        System.out.println("union IS :" + l3);
                        break;
                case 2: 
                        for(int i = 0; i < l1.size(); i++) {
                            l4.add(l1.get(i));
                        }   
                        l4.retainAll(l2);   
                        System.out.println("intersection is  :" + l4);
                        break;
                case 3:
                        System.exit(0);
            }
        }
        
    }
}