import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    public static final int MAX_NUM = 10000;

    public static int n, k;
    public static int[] arr = new int[MAX_N];

    public static int countNum(int l, int r) {
        int cnt = 0;
        for(int i = 0; i < n; i++)
            if(l <= arr[i] && arr[i] <= r)
                cnt++;

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ans = 0;

        for(int i = 1; i <= MAX_NUM; i++) {
            ans = Math.max(ans, countNum(i, i + k));
        }

        System.out.println(ans);
    }
}