import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                double avg = (double)sum / (j - i + 1);

                boolean exists = false;
                for (int l = i; l <= j; l++) {
                    if (exists == false && avg == arr[l]) {
                        exists = true;
                        result += 1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}