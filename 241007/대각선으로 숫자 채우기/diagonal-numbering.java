import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 1;

        int[][] arr = new int[n][m];

        for (int i = 0; i < m; i++) {
            int currRow = 0;
            int currCol = i;
            while (0 <= currCol &&  currRow < n)  {
                arr[currRow][currCol] = cnt;
                currRow++;
                currCol--;
                cnt++;
            }
        }

        for (int i = 1; i < n; i++) {
            int currRow = i;
            int currCol = m - 1;
            while (0 <= currCol &&  currRow < n)  {
                arr[currRow][currCol] = cnt;
                currRow++;
                currCol--;
                cnt++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}