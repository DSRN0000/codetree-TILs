import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        
        int[] ta = new int[n];
        int[] tb = new int[n];

        int minTa = Integer.MAX_VALUE;
        int maxTb = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();

            minTa = Math.min(minTa, ta[i]);
            maxTb = Math.max(maxTb, tb[i]);
        }

        int answer = Integer.MIN_VALUE;
        for (int i = minTa; i <= maxTb; i++) {

            int sum = 0;
            for (int j = 0; j < n; j++) {

                if (i < ta[j]) {
                    sum += c;
                }

                if (ta[j] <= i && i <= tb[j]) {
                    sum += g;
                }

                if (tb[j] < i) {
                    sum += h;
                }
            }
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}