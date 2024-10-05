import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n; i++) {
            
            if (i % 2 == 0) {
                for (int k = 0; k < 1 + (i / 2); k++) {
                    System.out.print("* ");
                }
            }

            if (i % 2 != 0) {
                for (int k = 0; k < n - (i - 1) / 2; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}