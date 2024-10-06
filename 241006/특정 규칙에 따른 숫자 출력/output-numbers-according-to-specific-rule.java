import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = n; i > 0; i--) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                if (9 < cnt){
                    cnt = 1;
                }
                System.out.print(cnt + " ");
                cnt += 1;
            }
            System.out.println();
        }
    }
}