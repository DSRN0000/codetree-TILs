import java.util.*;
public class Main {
    private static int n, dirNum;
    private static int[] dx = new int[]{0, -1, 0, 1};
    private static int[] dy = new int[]{-1, 0, 1, 0};
    private static int[][] arr;
    private static boolean isRange(int x, int y) {
        return (0 <= x && x < n &&  0 <= y && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];

        int x = n - 1;
        int y = n - 1;

        arr[n - 1][n - 1] = n * n;
        for (int i = n * n - 1; i > 0; i--) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            if (!(isRange(nx, ny) && arr[nx][ny] == 0)) {
                dirNum = (dirNum + 1) % 4;
            }
            x += dx[dirNum];
            y += dy[dirNum];

            arr[x][y] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}