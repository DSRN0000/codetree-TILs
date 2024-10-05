import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    result += 1;
                    System.out.print(result + " ");
                }

                if (i % 2 != 0) {
                    result += 2;
                    System.out.print(result + " ");
                }
            }
            System.out.println();
        }
    }
}