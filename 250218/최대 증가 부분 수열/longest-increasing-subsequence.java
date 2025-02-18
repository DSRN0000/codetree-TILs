import java.util.*;
public class Main {
    public static int n;
    public static int[] arr;
    public static int[] dp;

    public static void initialize() {
        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MIN_VALUE;
        }
        arr[0] = 0;
        dp[0] = 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        initialize();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int answer = 0;
        for (int i = 0; i <= n; i++) {
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}