import java.util.*;

public class Main {
    private static int n, t, x, y, dirNum, answer;
    private static int[][] grid;
    private static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    private static int[] dy = {0, 1, 0, -1};

    // 격자 범위 체크
    private static boolean isInRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        n = sc.nextInt(); // 격자 크기
        t = sc.nextInt(); // 명령어 수
        String commands = sc.next(); // 명령어 문자열
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt(); // 격자 값 입력
            }
        }

        // 초기 위치 (중앙)
        x = n / 2;
        y = n / 2;

        // 초기 위치 값 처리
        answer = grid[x][y];
        grid[x][y] = 0; // 초기 위치 값 0으로 초기화

        // 명령어 수행
        for (int i = 0; i < t; i++) {
            char command = commands.charAt(i);

            if (command == 'L') {
                dirNum = (dirNum - 1 + 4) % 4; // 왼쪽 회전
            } else if (command == 'R') {
                dirNum = (dirNum + 1) % 4; // 오른쪽 회전
            } else if (command == 'F') {
                // 이동
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if (isInRange(nx, ny)) {
                    x = nx;
                    y = ny;

                    // 새로운 위치 값 처리
                    answer += grid[x][y];
                    grid[x][y] = 0; // 중복 계산 방지
                }
            }
        }

        // 결과 출력
        System.out.println(answer);
    }
}
