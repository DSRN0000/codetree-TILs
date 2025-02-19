import java.util.*;
public class Main {
    public static int n, m;
    public static int[] arr;
    public static int[] dp;
    public static void initailize() {
        for (int i = 1; i <= m; i++) {
            dp[i] = 10000;
        }
        dp[0] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        dp = new int[m + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        initailize();

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 0; j--) {
                if (j >= arr[i]) {
                    if (dp[j - arr[i]] == 10000) {
                        continue;
                    }
                    dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                }
            }
        }

        int answer = dp[m];

        if (answer == 10000) {
            System.out.println(-1);
        }
        else {
            System.out.println(dp[m]);
        }
    }
}