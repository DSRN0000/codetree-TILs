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
    private static int n, x, y;
    private static int[][] arr;
    private static ArrayList<Integer> arrList = new ArrayList<>();
    
    private static int[] dx = new int[]{1, -1, 0, 0};
    private static int[] dy = new int[]{0, 0, -1, 1};

    private static boolean isRange(int nx, int ny) {
        return (1 <= nx && nx < n && 1 <= ny && ny < n);
    }

    private static boolean canGo(int nx, int ny, int cnumber){
        return isRange(nx, ny) && arr[nx][ny] > cnumber;
    }

    private static boolean move() {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (canGo(nx, ny, arr[x][y])) {
                x = nx;
                y = ny;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        arrList.add(arr[x][y]);
        
        while (true) {
            boolean b = move();

            if (!b) {
                break;
            }
            arrList.add(arr[x][y]);
        }

        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
    }
}