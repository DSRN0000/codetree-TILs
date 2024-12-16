import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int INT_MAX = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                int sum  = arr[i][j] + arr[i][j + 1] + arr[i][j+2];
                if (INT_MAX < sum) {
                    INT_MAX = sum;
                }
            }
        }

        System.out.println(INT_MAX);
    }
}