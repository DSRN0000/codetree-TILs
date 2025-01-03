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
        int result = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int money = b;
            if (price[i] == 0) {
                continue;
            }
            
            else if (price[i] != 0) {
                result = (price[i] / 2) + t[i];
                cnt = 1;
                money -= result;
            }

            for (int j = 0; j < n; j++) {
                if (i != j && price[j] != 0) {
                    result = sum[j];
                    cnt += 1;
                    money -= result;
                }

                if (money == 0) {
                    break;
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