import java.util.*;

public class Main {
    private static int x, y, n, t, dirNum, answer;
    private static int[][] arr;
    private static int[] dx = new int[]{-1, 0, 1, 0};
    private static int[] dy = new int[]{0, 1, 0, -1};

    private static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    private static void direction(char d) {
        int nx = x; // 현재 x 위치로 초기화
        int ny = y; // 현재 y 위치로 초기화

        if (d == 'L') {
            dirNum = (dirNum - 1 + 4) % 4;
        }
        if (d == 'R') {
            dirNum = (dirNum + 1) % 4;
        }
        if (d == 'F') {
            nx = x + dx[dirNum]; // 이동할 x 위치 계산
            ny = y + dy[dirNum]; // 이동할 y 위치 계산
            if (isRange(nx, ny)) { // 이동 범위가 유효한 경우만 갱신
                x = nx;
                y = ny;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        arr = new int[n][n];
        String s = sc.next();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        x = n / 2;
        y = n / 2;

        for (int i = 0; i < t; i++) {
            direction(s.charAt(i)); // 이동 후
            answer += arr[x][y];    // 이동한 위치에서 값을 누적
            arr[x][y] = 0;          // 방문한 위치 초기화
        }

        System.out.println(answer);
    }
}
