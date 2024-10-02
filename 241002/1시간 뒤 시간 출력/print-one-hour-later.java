import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b;

        sc.useDelimiter(":");

        a = sc.nextInt();
        b = sc.nextInt();
        
        a += 1;

        System.out.println(a + ":"+ b);

    }
}