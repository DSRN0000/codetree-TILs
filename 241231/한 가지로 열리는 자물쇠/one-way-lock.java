import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    int num1 = Math.abs(a - i);
                    int num2 = Math.abs(b - j);
                    int num3 = Math.abs(c - k);
                    if (num1 > 2 && num2 > 2 && num3 > 2) {
                        cnt += 1;
                    }
                }
            }
        }
        System.out.println((n*n*n) - cnt);
    }
}