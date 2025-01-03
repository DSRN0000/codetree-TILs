// 41분 14초 남음
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

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int minx = Integer.MAX_VALUE;
            int maxx = Integer.MIN_VALUE;
            int miny = Integer.MAX_VALUE;
            int maxy = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    minx = Math.min(minx, x[j]);
                    maxx = Math.max(maxx, x[j]);

                    miny = Math.min(miny, y[j]);
                    maxy = Math.max(maxy, y[j]);
                }
            }

            int result = (maxx - minx) * (maxy - miny);
            answer = Math.max(answer, result);
        } 
        System.out.println(answer);
    }
}