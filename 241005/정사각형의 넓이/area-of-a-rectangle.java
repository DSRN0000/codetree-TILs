import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n, result;
        n = sc.nextInt();

        result = n * n;
        System.out.println(result);

        if (n < 5) {
            System.out.println("tiny");
        }
    }
}