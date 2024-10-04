import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int h,w,b;

        h = sc.nextInt();
        w = sc.nextInt();

        b = (10000 * w) / (h * h);
        System.out.println(b);

        if (25 <= b) {
            System.out.println("Obesity");
        }
    }
}