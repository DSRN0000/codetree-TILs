import java.util.*;
public class Main {
/*
    // n, r, c 입력 받기
    // 상하좌우 숫자 크기 비교 후 가장 큰 함수 리턴하는 함수
    // 같은 숫자일 때 상하좌우 순서로 우선순위 지정 함수
    // 격자의 범위를 벗어났는지 판단하는 함수
*/

/*
강사님
    -무한 반복문 : 
        - 이동 가능? / 한다면 어디로?
        - 이동
*/
    private static int n, x, y, rx, ry;
    private static int[][] arr;
    
    private static int[] dx = new int[]{1, -1, 0, 0};
    private static int[] dy = new int[]{0, 0, -1, 1};

    private static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    private static void move(int cx, int cy, int cnumber) {

        int max = cnumber;

        for (int i = 0; i < 4; i++) {
            int nx = cx + dx[i];
            int ny = cy + dy[i];

            if (isRange(nx, ny) && arr[nx][ny] > max) {
                max = arr[nx][ny];
                rx = nx;
                ry = ny;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt() - 1;
        y = sc.nextInt() - 1;
        rx = x;
        ry = y;
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        while (true) {
            System.out.print(arr[x][y] + " ");

            move(x, y, arr[x][y]);

            if (x == rx && y==ry) {
                break;
            }

            x = rx;
            y = ry;
            
        }
    }
}