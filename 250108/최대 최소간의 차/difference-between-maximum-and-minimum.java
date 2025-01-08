import java.util.*;
public class Main {
    private static int n, k;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= 10000; i++) {

            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (i <= arr[j] && arr[j] <= i + k) {
                    continue;
                }
                else if (arr[j] < i) {
                    sum += Math.abs(arr[j] - i);
                }
                else {
                    sum += Math.abs(arr[j] - (i + k));
                }
            }
            
            answer = Math.min(answer, sum);
        }
        System.out.println(answer);
    }
}