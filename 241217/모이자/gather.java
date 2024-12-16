import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int INT_MIN = Integer.MAX_VALUE;
        for (int i = 1; i < n + 1; i++) {
            int sum = 0;
            for (int j = 1; j < n + 1; j++) {
                sum += Math.abs(i - j) * arr[j  - 1];
            }
            if (sum < INT_MIN) {
                INT_MIN = sum;
            }
        }
        System.out.println(INT_MIN);
    }
}