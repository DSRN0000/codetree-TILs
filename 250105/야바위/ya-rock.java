import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] arr = new int[3];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int maxCnt = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[0] = arr[1] = arr[2] = 0;

            arr[i] = 1;

            int cnt = 0;
            for (int k = 0; k < n; k++) {
                int tmp = arr[b[k] - 1];
                arr[b[k] - 1] = arr[a[k] - 1];
                arr[a[k] - 1] = tmp;

                if (arr[(c[k]- 1)] == 1) {
                    cnt += 1;
                }
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        System.out.println(maxCnt);
    }
}