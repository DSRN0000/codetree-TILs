import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n - t; i++) {
            int cnt = 0;

            for (int p = 0; p < n; p++) {
                arr2[p] = arr[p];
            }   
            for (int j = i; j < i + t; j++) {
                if (arr2[j] < h) {
                    cnt += h - arr2[j];
                    arr2[j] = h;
                }

                if (arr2[j] > h) {
                    cnt += arr2[j] - h;
                    arr2[j] = h;
                }
            }
            answer = Math.min(answer, cnt);
        }
        System.out.println(answer);
    }
}