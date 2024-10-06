import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int passCnt = 0;

        for (int i = 0; i < num; i++) {
            int[] scores = new int[4];
            int sum = 0;

            for (int j = 0; j < 4; j++) {
                scores[i] = sc.nextInt();
                sum += scores[i];
            }

            int avg = sum / 4;

            if (60 <= avg) {
                passCnt++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(passCnt);
    }
}