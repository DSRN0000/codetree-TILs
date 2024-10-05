import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (result < 1) {
                    result = 9;
                }
                System.out.print(result);
                result -= 1;
            }
            System.out.println();
        }
    }
}