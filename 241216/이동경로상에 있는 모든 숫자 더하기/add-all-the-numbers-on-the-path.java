import java.util.*;
public class Main {
    private static int x, y, n, t, dirNum, answer;
    private static int[][] arr;
    // private static string [] s;
    private static int[] dx = new int[]{-1, 0, 1, 0};
    private static int[] dy = new int[]{0, 1, 0, -1};

    private static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    private static void direction(char d) {
        int nx = 0;
        int ny = 0;

        if (d == 'L') {
            dirNum = (dirNum - 1 + 4) % 4;
        }
        if (d == 'R') {
            dirNum = (dirNum + 1) % 4;
        }
        if (d == 'F') {
            nx += x + dx[dirNum];
            ny += y + dy[dirNum];
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
        arr[x][y] = 0;
        for (int i = 0; i < t; i++) {
            direction(s.charAt(i));
            answer += arr[x][y];
            // System.out.println("x = " + x + " " + "y = " + y);
            // System.out.println(answer);
            arr[x][y] = 0;
        }

        // System.out.println("========");
        System.out.println(answer);

        // for(int i = 0; i < t; i++) {
        //     System.out.println(s.charAt(i));
        // } 


        // for(int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}