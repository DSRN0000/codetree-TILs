import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            int stars = 2 * i - 1;

            for (int j = 0; j < (n - i) * 2;  j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}