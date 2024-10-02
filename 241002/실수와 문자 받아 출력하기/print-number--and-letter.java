import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result_a = Math.round(a * 100) / 100.0;
        double result_b = Math.round(b * 100) / 100.0;

        System.out.println(c);
        System.out.println(result_a);
        System.out.println(result_b);

    }
}