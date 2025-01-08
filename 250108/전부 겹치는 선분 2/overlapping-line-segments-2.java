import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }

        String s = "NO";
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && i != k) {
                        if (arr1[j] <= arr1[k] && arr2[k] <= arr2[j]) {
                            cnt += 1;
                        }
                    }  
                }
            }
            if (cnt == n - 1) {
                s = "Yes";
            }
        }
        System.out.println(s);
    }
}