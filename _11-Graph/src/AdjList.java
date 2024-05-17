import java.util.*;

class AdjList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges : ");
        int v = in.nextInt();
        int e = in.nextInt();

        LinkedList<Integer>[] list = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            list[i] = new LinkedList<>();
        }

        for (int i = 0; i < e; i++) {
            System.out.println("enter the edges from one to another : ");
            int a = in.nextInt();
            int b = in.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i < v; i++) {
            System.out.print("Vertex" + i + ":");
            for (Integer vertex : list[i]) {
                System.out.print("->" + vertex);
            }
            System.out.println();
        }
    }
}