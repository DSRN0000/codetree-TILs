import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for (int i = start; i <= end; i++) {
            int result = 0;
            for (int j = 1; j <= i - 1; j++) {

                if (i % j == 0) {
                    result += j;
                }
            }
            if (result == i)
                cnt += 1; 
        }
        System.out.println(cnt);
    }
}