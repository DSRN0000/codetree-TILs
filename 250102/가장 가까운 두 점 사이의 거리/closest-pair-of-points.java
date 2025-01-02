import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int result = (x[i] - x[j]) * (x[i] - x[j]) + ((y[i] - y[j]) * (y[i] - y[j]));
                answer = Math.min(answer, result);
            }
        }
        System.out.println(answer);
    }
}