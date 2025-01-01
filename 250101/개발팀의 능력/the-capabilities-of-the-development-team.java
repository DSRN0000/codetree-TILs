import java.util.*;
public class Main {
    private static int n = 5;
    private static int[] arr;
    private static int diff (int i, int j, int k) {
        int sum1 = arr[i];
        int sum2 = arr[j] + arr[k];
        int sum3 = 0;

        for (int a = 0; a < n; a++) {
            sum3 += arr[a];
        }

        sum3 = sum3 - (sum1 + sum2);
        if (sum1 == sum2 && sum2 == sum3) {
            return Integer.MAX_VALUE;
        }

        int max = Math.max(sum1, sum2);
        int min = Math.min(sum1, sum2);
        return Math.max(max, sum3) - Math.min(min, sum3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i != j && i != k) {
                        answer = Math.min(answer, diff(i, j, k));
                    }
                }
            }
        }
        System.out.println(answer);
    }
}