import java.util.*;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int n, m;
    private static int[][] map;
    private static int[][] visited;
    private static Queue<Pair> q = new LinkedList<>();

    private static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    private static boolean canGo(int x, int y) {
        if (!inRange(x, y)) {
            return false;
        }

        if (visited[x][y] == 1) {
            return false;
        }

        if (map[x][y] == 0) {
            return false;
        }

        return true;
    }

    private static void push(int x, int y) {
        visited[x][y] = 1;
        q.add(new Pair(x, y));
    }

    private static void bfs() {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int x = curr.x;
            int y = curr.y;

            for (int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (canGo(nx, ny)) {
                    push(nx, ny);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        push(0, 0);
        bfs();

        System.out.println(visited[n - 1][m - 1]);
    }
}