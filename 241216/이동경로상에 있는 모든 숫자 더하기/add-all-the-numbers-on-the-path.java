import java.util.*;
public class Main {
    private static int x, y, n, t, dirNum, answer, nx, ny;
    private static int[][] arr;
    private static int[] dx = new int[]{-1, 0, 1, 0};
    private static int[] dy = new int[]{0, 1, 0, -1};

    private static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    private static void direction(char d) {
        if (d == 'L') {
            dirNum = (dirNum - 1 + 4) % 4;
        }
        if (d == 'R') {
            dirNum = (dirNum + 1) % 4;
        }
        if (d == 'F') {
            nx = x + dx[dirNum];
            ny = y + dy[dirNum];
            if (isRange(nx, ny)) {
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

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        x = n / 2;
        y = n / 2;
        answer += arr[x][y];

        for (int i = 0; i < t; i++) {
            char c = s.charAt(i);
            if (c == 'F') {
                direction(c);
                if (isRange(nx, ny)) {
                    answer += arr[x][y];
                }
                
            }
            else if (c != 'F') {
                direction(c);
            }
        }
        System.out.println(answer);
    }
}