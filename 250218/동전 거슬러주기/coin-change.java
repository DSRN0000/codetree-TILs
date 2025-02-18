import java.util.*;
public class Main {
    public static int n, m;
    public static int[] arr;
    public static int[] dp;

    public static void initialize() {
        for (int i = 0; i <= m; i++) {
            dp[i] = 10000;
        }
        dp[0] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];
        dp = new int[m + 1];

        initialize();

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= arr[j]) {
                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1);
                }
            }
        }

        if (dp[m] == 10000) {
            System.out.println(-1);
        }
        else {
            System.out.println(dp[m]);
        }
    }
}