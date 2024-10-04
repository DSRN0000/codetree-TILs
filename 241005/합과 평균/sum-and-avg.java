import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b;
        double  sum, avg;

        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        avg = sum / 2;

        System.out.printf("%.0f %.1f",sum, avg);

    }
}