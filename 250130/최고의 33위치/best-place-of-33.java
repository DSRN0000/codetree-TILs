import java.util.*;
public class Main {
    private static int n;
    private static int[][] arr;

    private static int findCoins(int y, int y3, int x, int x3) {
        int result = 0;

        for (int i = y; i <= y3; i++) {
            for (int j = x; j <= x3; j++) {
                if (arr[i][j] == 1) {
                    result += 1;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                
                if (i + 2 >= n && j + 2 >= n) {
                    continue;
                }

                int number = findCoins(i, i + 2, j, j + 2);
                answer = Math.max(answer, number);
            }
        }
        System.out.println(answer);
    }
}