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
    private static int[][] maps;
    private static boolean[][] visited;
    private static int[][] answer;
    private static int[] dx = new int[]{-1, 1, 0, 0};
    private static int[] dy = new int[]{0, 0, -1, 1}; 

    private static Queue<Pair> queue = new LinkedList<>(); 

    private static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    private static boolean canGo(int x, int y) {
        return inRange(x, y) && visited[x][y] == false && maps[x][y] == 1; 
    }

    private static void push(int x, int y, int number) {
        visited[x][y] = true;
        answer[x][y] = number;
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
                    push(nx, ny, answer[x][y] + 1);
                }
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        maps = new int[n][m];
        visited = new boolean[n][m];
        answer = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maps[i][j] = sc.nextInt();
            }
        }

        push(0, 0, 0);
        bfs();

        if (answer[n - 1][m - 1] == 0) {
            System.out.println(-1);
        }

        else {
            System.out.println(answer[n - 1][m - 1]);
        }
        
    }
}