import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= b[0] / 2; i++) {
            int num = i * 2;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] <= num && num <= b[j]) {
                    num = num * 2;
                    cnt += 1;
                }
            }
            if (cnt == n) {
                answer = Math.min(answer, i);
            }
        }
        System.out.println(answer);
    }
}