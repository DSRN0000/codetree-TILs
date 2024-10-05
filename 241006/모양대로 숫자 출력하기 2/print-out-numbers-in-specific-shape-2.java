import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                result += 2;
                if (9 < result) {
                    result = 2;
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}