import java.util.*;
public class Main {
    private static int[] arr;
    private static int diff (int i, int j, int k) {
        int sum1 = arr[i] + arr[j] + arr[k];
        int sum2 = 0;
        for (int a = 0; a < 6; a++) {
            sum2 += arr[a];
        }
        sum2 -= sum1;
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    answer = Math.min(answer, diff(i, j, k));
                }
            }
        }
        System.out.println(answer);
    }
}