import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }


        String s = "No";
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                max = Math.max(max, x1[j]);
                min = Math.min(min, x2[j]);
            }
            if (min >= max) {
                s = "Yes";
            }
        }
        System.out.print(s);
    }
}