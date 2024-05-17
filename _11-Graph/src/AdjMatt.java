import java.util.*;

class AdjMatt {
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
            System.out.println("Enter the edges from one to another : ");
            int a = in.nextInt();
            int b = in.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i < v; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer vertex : list[i]) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }

        System.out.println("BFS Traversal starting from vertex 0:");
        bfs(list, v, 0);
    }

    public static void bfs(LinkedList<Integer>[] list, int v, int start) {
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : list[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}
