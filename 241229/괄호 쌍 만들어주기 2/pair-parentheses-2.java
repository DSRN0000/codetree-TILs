import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                if (s.charAt(i) == '(' && s.charAt(i + 1) == '(' && s.charAt(j) == ')' && s.charAt(j + 1) ==')') {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}