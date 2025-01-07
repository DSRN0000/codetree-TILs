import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                if ((a[i] == a[j] && b[i] == b[j]) || (a[i] == b[j] && a[j] == b[i])) {
                    cnt += 1;
                }
            }
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}