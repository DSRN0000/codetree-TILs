import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int MAX_N = 100;

    public static int n, k;
    public static int[] arr = new int[MAX_N];

    public static boolean isPossible(int limit) {
        int lastIdx = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= limit) {
                if (i - lastIdx > k)
                    return false;
                lastIdx = i;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열에서 최소와 최대값 찾기
        int low = Math.max(arr[0], arr[n - 1]); // 시작 범위
        int high = Arrays.stream(arr, 0, n).max().getAsInt(); // 배열 최댓값
        int result = high;

        // 이진 탐색
        while (low <= high) {
            int mid = (low + high) / 2;

            if (isPossible(mid)) {
                result = mid; // 가능한 값을 갱신
                high = mid - 1; // 더 작은 값 탐색
            } else {
                low = mid + 1; // 더 큰 값 탐색
            }
        }

        System.out.println(result);
    }
}
