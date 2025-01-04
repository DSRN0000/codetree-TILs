import java.util.*;
public class Main {

    private static boolean isFelind(int i) {
        String s = Integer.toString(i);
        int len = s.length();
        int[] arr = new int[len];
        for (int j = 0; j < len; j++) {
            arr[j] = s.charAt(j) - '0';
        }

        boolean result = true;
        for (int j = 0; j < len; j++) {
            if (arr[j] != arr[len - j -  1]) {
                result = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int answer = 0;
        for (int i = x; i <= y; i++) {
            if (isFelind(i)) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}