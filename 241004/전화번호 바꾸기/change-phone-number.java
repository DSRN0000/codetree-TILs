import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");

        String a, b ,c;
        a = sc.next();
        b = sc.next();
        c = sc.next();

        System.out.println(a + "-" + c + "-" + b);
    }
}