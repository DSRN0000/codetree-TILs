import java.util.*;
public class Main {
    private static int n;
    private static int[] arr;
    public static int score(int removedIdx) {
        
        int sum = 0;
        int prev = -1;
        for(int i = 0; i < n; i++) {

            if(i == removedIdx) continue;

            if(prev != -1)
                sum += Math.abs(arr[i] - prev);

            prev = arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            arr[i] = arr[i] * 2;
            for (int j = 0; j < n; j++) {
                answer = Math.min(answer, score(j));
            }
            arr[i] = arr[i] / 2;
        }
        System.out.println(answer);
    }
}