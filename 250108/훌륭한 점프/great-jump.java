import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_NUM = 100;

    public static int n, k;
    public static int[] arr = new int[MAX_N];

    public static boolean isPossible(int limit) {
        int lastIdx = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] <= limit) {
                if(i - lastIdx > k)
                    return false;
                lastIdx = i;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 1; i <= MAX_NUM; i++)
            if(isPossible(i)) {
                System.out.println(i);
                break;
            }
    }
}