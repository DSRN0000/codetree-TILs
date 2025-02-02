import java.util.*;

public class Main {
    private static int n, m, cnt;
    private static int[][] arr;
    private static boolean[] visited;

    private static void dfs(int vertex) {
        for (int currV = 1; currV <= n; currV++) {
            if (arr[vertex][currV] == 1 && !visited[currV]) {
                visited[currV] = true;
                cnt += 1;
                dfs(currV);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        visited[1] = true;
        dfs(1);

        System.out.println(cnt);
    }
}