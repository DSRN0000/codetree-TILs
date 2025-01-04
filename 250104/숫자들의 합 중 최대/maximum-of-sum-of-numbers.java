import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int answer = Integer.MIN_VALUE;
        for (int i = x; i <= y; i++) {
            int number = i;
            int sum = 0;

            String s = Integer.toString(number);
            for (int j = 0; j < s.length(); j++) {
                sum += Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}