import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,div,mul;

        a = sc.nextInt();
        b = sc.nextInt();

        div = a / b;
        mul = a * b;

        System.out.printf("%d * %d = %d\n", a, b, mul);
        System.out.printf("%d / %d = %d\n", a, b, div);
    }
}