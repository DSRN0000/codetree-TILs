import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == '(' && s.charAt(j) == ')'){
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}