import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int cnt = 0;
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 0)  {
                break;
            }
            sum += num[i]; 
            cnt++;
        }

        avg = (double)sum / cnt;

        System.out.printf("%d %.1f", sum, avg);
    }
}