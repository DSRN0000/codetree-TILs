import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();

        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        String s = "nonintersecting";
        for (int i = x1; i <= x2; i++) {
            for (int j = x3; j <= x4; j++) {
                if (x1 <= j || j <= x2) {
                    s = "intersecting";
                }
            }
        }
        System.out.println(s);
    }
}