import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] score = new double [n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextDouble();
            sum += score[i];
        }
        double avg = sum / n;
        System.out.printf("%.1f\n", avg);

        if (4.0 < avg) {
            System.out.println("Perfect");
        } else if (3.0 < avg && avg < 4.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}