import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[s];

        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < s - 1; i++) {
            for (int j = i + 1; j < s; j++) {
                int sum = 0;
                int result = 0;
                for (int k = 0; k < s; k++) {
                    if (arr[k] != arr[i] && arr[k] != arr[j]) {
                        sum += arr[k];
                    }
                }
                result = Math.abs(n - sum);
                if (result < answer) {
                    answer = result;
                }
            }   
        }
        System.out.println(answer);
    }
}