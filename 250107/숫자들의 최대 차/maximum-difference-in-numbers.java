import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) <= k) {
                    cnt += 1;
                }
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);
    }
}