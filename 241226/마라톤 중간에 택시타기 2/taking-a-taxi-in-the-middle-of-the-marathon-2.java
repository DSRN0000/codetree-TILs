import java.util.*;
public class Main {
    private static int n;
    private static int[] x;
    private static int[] y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];
        y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int INT_MIN = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            int sum = 0;
            int index = 0;
            for (int j = 1; j < n; j++) {
                if (i == j) {
                    continue;
                }
                sum += Math.abs(x[index] - x[j]) + Math.abs(y[index] - y[j]);
                index = j;
            }
            if (sum < INT_MIN) {
                INT_MIN = sum;
            }
        }

        System.out.println(INT_MIN);
    }
}