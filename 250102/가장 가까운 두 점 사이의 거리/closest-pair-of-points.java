import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int minx = Integer.MAX_VALUE;
        int miny = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                minx = Math.min(minx, Math.abs(x[i] - x[j]));
                miny = Math.min(miny, Math.abs(y[i] - y[j]));
            }
        }
        answer = (minx * minx) + (miny * miny);
        System.out.println(answer);
    }
}