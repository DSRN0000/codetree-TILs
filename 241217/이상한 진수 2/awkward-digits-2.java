import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = Integer.toString(a);

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                cnt += 1;
                System.out.println(s.substring(0, i));
                System.out.println(s.substring(i));
                s = s.substring(0, i) + '1' + s.substring(i + 1);
                break;
            }
        }
        if (cnt == 0) {
            s = s.substring(0, s.length() - 1) + '0';
        }

        int result = Integer.parseInt(s, 2);

        System.out.println(result);
    }
}