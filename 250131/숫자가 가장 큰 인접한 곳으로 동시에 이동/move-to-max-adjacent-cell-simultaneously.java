/*
입력 : n*n 격자, m개 구슬
(함수)
- isRange(), update(), move()

(순서)
1. 입력 받기
2. 격자 번호 받기
3. m개 위치 받기
4. 시간 입력 받기
5. isRange(), update(), move() 함수 만들기
6. count 배열 차례대로 순회 1? -> move  
*/
import java.util.*;
class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    private static int n, m, t;

    private static int[][] arr;
    private static int[][] count;
    private static int[][] newCount;

    private static int[] dx = new int[]{-1, 1, 0 ,0};
    private static int[] dy = new int[]{0, 0, -1, 1};

    private static boolean inRange(int x, int y) {
        return 1 <= x && x <= n && 1 <= y && y <= n;
    }

    private static Pair update(int x, int y) {
        int max = 0;
        Pair maxPos = new Pair(-1, -1);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (inRange(nx, ny) && arr[nx][ny] > max) {
                max = arr[nx][ny];
                maxPos = new Pair(nx, ny);
            }
        }

        return maxPos;
    }

    private static void move(int x, int y) {
        Pair nextPos = update(x, y);
        int nextX = nextPos.x;
        int nextY = nextPos.y;

        newCount[nextX][nextY] += 1;
    }

    private static void moveAll() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                newCount[i][j] = 0;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (count[i][j] == 1) {
                    move(i, j);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                count[i][j] = newCount[i][j];
            }
        }
    }

    private static void removeSamePlace() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (count[i][j] >= 2) {
                    count[i][j] = 0;
                }
            }
        }
    }

    private static void simulate() {
        moveAll();
        removeSamePlace();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();

        arr = new int[n + 1][n + 1];
        count = new int[n + 1][n + 1];
        newCount = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            count[x][y] = 1;
        }

        while(t-- > 0) {
            simulate();
        }

        int answer = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                answer += count[i][j];
            }
        }
        System.out.println(answer);
    }
}