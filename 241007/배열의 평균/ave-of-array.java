import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            int sum1 = 0; 
            double avg1 = 0;
            for (int j = 0; j < 4; j++) {
                sum1 += arr[i][j];
            }
            avg1 = (double)sum1 / 4;
            System.out.printf("%.1f ", avg1);
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            int sum2 = 0; 
            double avg2 = 0;
            for (int j = 0; j < 2; j++) {
                sum2 += arr[j][i];
            }
            avg2 = (double)sum2 / 2;
            System.out.printf("%.1f ", avg2);
        }
        System.out.println();

        int sum3 = 0; 
        double avg3 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum3 += arr[i][j];
            }
        }
        avg3 = (double)sum3 / 8;
        System.out.printf("%.1f \n", avg3);
    }
}