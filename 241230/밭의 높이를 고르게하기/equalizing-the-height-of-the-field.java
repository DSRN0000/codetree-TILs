import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n - t; i++) {
            int cnt = 0;
            int result = 0;
            for (int j = i; j < i + t; j++) {
                if (arr[j] != h && arr[j] < h) {
                    arr[j] += 1;
                    cnt += 1;
                }

                if (arr[j] != h && arr[j] > h) {
                    arr[j] -= 1;
                    cnt += 1;
                }

                if (arr[j] == h) {
                    result += 1;
                }

                if (result >= t) {
                    break;
                }
            }
            answer = Math.min(answer, result);
            if (result < t) {
                answer = result;
            }
        }
        System.out.println(answer);
    }
}