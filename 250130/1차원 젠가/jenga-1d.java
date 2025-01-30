import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            int s1 = sc.nextInt();
            int e1 = sc.nextInt();

            for (int j = s1 - 1; j < e1; j++) {
                arr[j] = 0;
            }

            int cnt = 0;
            int[] tmparr = new int[n];
            for (int j = 0; j < n; j++) {
                if (arr[j] != 0) {
                    tmparr[cnt] = arr[j];
                    cnt += 1;
                }
            }

            for (int j = 0; j < n; j++) {
                arr[j] = tmparr[j];
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                cnt += 1;
            }
        }

        System.out.println(cnt);
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }

    }
}