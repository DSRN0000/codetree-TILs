import java.util.*;
public class Main {
    public static int n, m;
    public static int[] arr;
    public static int[] dp;

    public static void initalize() {
        for (int i = 0; i <= m; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        arr[0] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];
        dp = new int[m + 1];

        initalize();

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= arr[j]) {
                    if (dp[i - arr[j]] == Integer.MAX_VALUE) {
                        continue;
                    }

                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1);
                }
            }
        }
        System.out.println(dp[m]);
    }
}