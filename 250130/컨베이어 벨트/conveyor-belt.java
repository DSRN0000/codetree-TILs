import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            int tmp1 = arr1[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                arr1[j + 1] = arr1[j];
            }

            int tmp2 = arr2[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                arr2[j + 1] = arr2[j];
            }
            arr2[0] = tmp1;
            arr1[0] = tmp2;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}