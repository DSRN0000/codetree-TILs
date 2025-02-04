/*
1. n,m 입력 받기
2. 정답 리스트 , 뱀의 위치 리스트(격자 리스트), visited 리스트 생성
3. inRange 생성 -> 그리드 범위 벗어나지 않는지 확인하는 함수 
4. canGo 생성 -> 갈 수 있는 그리드인지 확인하는 함수
5. dfs 생성
5. 정답 리스트에 따라 0 , 1 정답 출력
*/
import java.util.*;
public class Main {

    private static int n, m;
    private static int order = 1;
    private static int[][] answer;
    private static int[][] grid;
    private static int[][] visited;

    private static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    private static boolean canGo(int x, int y) {
        if (!inRange(x, y)) {
            return false;
        }

        if (visited[x][y] == 1 || grid[x][y] == 0) {
            return false;
        }

        return true;
    }

    private static void dfs(int x, int y) {
        int[] dx = new int[]{1, 0};
        int[] dy = new int[]{0, 1};
        answer[x][y] = order++;
        visited[x][y] = 1;

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (canGo(nx, ny)) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        answer = new int[n][m];
        grid = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        dfs(0, 0);
    }
}