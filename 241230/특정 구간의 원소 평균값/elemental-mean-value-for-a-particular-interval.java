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
            for (int j = i + 1; j < n; j++) {
                int avg = 0;
                int sum = 0;
                int cnt = 0;

                for (int k = i; k < j; k++) {
                    sum += arr[k];
                    cnt += 1;
                }

                avg = sum / cnt;
                int count = 0;
                for (int l = i; l < j; l++) {
                    if (count == 0 && avg == arr[l]) {
                        result += 1;
                        count += 1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}