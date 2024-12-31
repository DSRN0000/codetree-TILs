import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 밭의 개수
        int h = sc.nextInt(); // 목표 높이
        int t = sc.nextInt(); // 최소 연속 구간 길이
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;

        // 연속 구간의 시작 위치를 설정
        for (int i = 0; i <= n - t; i++) {
            // arr2 초기화
            System.arraycopy(arr, 0, arr2, 0, n);

            int cnt = 0; // 비용
            // i부터 i + t 구간을 목표 높이 h로 맞추기
            for (int j = i; j < i + t; j++) {
                // 현재 높이가 목표 높이보다 낮은 경우
                if (arr2[j] < h) {
                    cnt += h - arr2[j];
                    arr2[j] = h;
                }
                // 현재 높이가 목표 높이보다 높은 경우
                else if (arr2[j] > h) {
                    cnt += arr2[j] - h;
                    arr2[j] = h;
                }
            }

            // 최소 비용 갱신
            answer = Math.min(answer, cnt);
        }

        System.out.println(answer);
    }
}
