import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int INT_MIN = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int number = (j + n - i) % n;
                sum += number * arr[j];
            }
            if (sum < INT_MIN) {
                INT_MIN = sum;
            }
        }

        System.out.println(INT_MIN);
    }
}