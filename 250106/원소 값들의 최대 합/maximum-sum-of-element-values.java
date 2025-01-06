import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int num = i;
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[num];
                num = arr[num] - 1;
            }
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}