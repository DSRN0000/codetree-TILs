import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        boolean satisfied = false;

        for (int i = a; i<=b; i++) {
            if (i % c == 0) {
                satisfied = true;
            }
        }

        if(satisfied == false)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}