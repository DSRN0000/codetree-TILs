import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] price = new int[n];
        int[] t = new int[n];
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
            t[i] = sc.nextInt();
            sum[i] = price[i] + t[i];
        }

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int result = (price[i] / 2) + t[i];
            int cnt = 1;
            int money = b - result;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    result = sum[j];
                    money -= result;
                }

                if (money >= 0) {
                    cnt += 1;
                }

                else if (money < 0) {
                    cnt -= 1;
                    break;
                }
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);
    }
}