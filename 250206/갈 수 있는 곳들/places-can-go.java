import java.util.*;
class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    private static int n, k, answer;

    private static int[][] maps;
    private static boolean[][] visited;

    private static Queue<Pair> queue = new LinkedList<>();

    private static int[] dx = new int[]{-1, 1, 0, 0};
    private static int[] dy = new int[]{0, 0, -1, 1};
    

    private static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    private static boolean canGo(int x, int y) {
        return inRange(x, y) && maps[x][y] == 0 && visited[x][y] == false;
    }

    private static void push(int x, int y) {
        visited[x][y] = true;
        queue.add(new Pair(x, y));
    }

    private static void bfs() {
        while(!queue.isEmpty()) {
            Pair curr = queue.poll();
            int x = curr.x;
            int y = curr.y;

            for (int i = 0; i < 4; i++) {
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
        k = sc.nextInt();
        maps = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maps[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            push(x - 1, y - 1);
            bfs();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == true) {
                    answer += 1;
                }
            }
        }

        System.out.println(answer);
    }
}