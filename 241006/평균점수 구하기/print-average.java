import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[8];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < 8; i++) {
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }

        avg = sum / 8;
        System.out.printf("%.1f", avg);

    }
}