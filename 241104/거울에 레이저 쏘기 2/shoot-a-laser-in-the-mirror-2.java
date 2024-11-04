import java.util.*;
public class Main {
    private static int n, k, x, y, moveDir;

    private static char[][] map;
 
    private static void initialize(int k) {
        if (k <= n) {
            x = 0; y = k - 1; moveDir = 0;
        }

        else if (k <= 2 * n) {
            x = k - n - 1; y = n - 1; moveDir = 1;
        }

        else if (k <= 3 * n) {
            x = n - 1; y = n - (k - 2 * n); moveDir = 2;
        }
        else {
            x = n - (k - 3 * n); y = 0; moveDir = 3;
        } 
    }

    private static boolean isRange(int x, int y) {
        return(0 <= x && x < n && 0 <= y && y < n);
    }

    private static void move(int nextDir) {
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        x += dx[nextDir];
        y += dy[nextDir];
        moveDir = nextDir;
    }

    private static int simulate() {
        int moveNum = 0;
        while(isRange(x,y)) {
            if (map[x][y] == '/') {
                move(moveDir ^ 1);
            }
            else {
                move(3 - moveDir);
            }
            moveNum += 1;
        }
        return moveNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new char[n][n];

        sc.nextLine(); // 개행문자 제거
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        k = sc.nextInt();

        initialize(k);

        int moveNum = simulate();
        System.out.println(moveNum);
    }
}