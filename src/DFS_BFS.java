import java.util.LinkedList;
import java.util.Queue;

public class DFS_BFS {

    static int n = 8;
    static int[][] graph = new int[][] { { 0, 1, 1, 0, 0, 0, 0, 0 }, { 1, 0, 0, 1, 1, 0, 0, 0 },
            { 1, 0, 0, 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0, 0, 1, 0 }, { 0, 1, 0, 0, 0, 0, 0, 1 },
            { 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0 } };
    static boolean[] visited = new boolean[n];

    public static void DFS(int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < n; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.offer(start);
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (int i = 0; i < n; i++) {
                if (graph[v][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("DFS : ");
        DFS(1);
        System.out.println();
        visited = new boolean[n];
        System.out.println("BFS : ");
        BFS(1);
    }
}






