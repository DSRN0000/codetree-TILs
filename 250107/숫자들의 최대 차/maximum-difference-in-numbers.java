import java.util.*;
public class Main {
    private static int n, k;
    private static int[] arr;

    private static int countNum(int l, int r) {
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(l <= arr[i] && arr[i] <= r) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 1; i < n; i++) {
            answer = Math.max(answer, countNum(i, i + k));
        }
        System.out.println(answer);
    }
}