import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a, b;
        double sum, minus, result;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        sum = a + b;
        minus = a - b;
        result = sum / minus;

        System.out.printf("%.2f", result);

    }
}