import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a, b, temp;
        a = sc.next();
        b = sc.next();

        temp = a;
        a = b;
        b = temp;
        
        System.out.println(a);
        System.out.println(b);

    }
}