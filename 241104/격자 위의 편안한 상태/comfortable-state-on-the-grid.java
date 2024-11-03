import java.util.*;
public class Main {
    private static int n, m, x, y;
    private static int[][] map;

    private static int[] dx = new int[]{-1, 0, 1, 0};
    private static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean isRange(int x, int y) {
        return(0 <= x && x < n && 0 <= y && y < n);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][n];

        for (int i = 0; i < m; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            map[x - 1][y - 1] = 1;

            int cnt = 0;
            for (int j = 0; j < 4; j++) {
                int nx = x - 1 + dx[j];
                int ny = y - 1 + dy[j];

                if (isRange(nx, ny) && map[nx][ny] == 1) {
                    cnt++;
                }
            }
            if (cnt == 3) {
                System.out.println(1);
            }
            if (cnt != 3) {
                System.out.println(0);
            }
        }
    }
}