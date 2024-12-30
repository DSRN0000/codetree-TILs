import java.util.*;
public class Main {
    public static void main(String[] args) {
        // n명의 사람들 , 크기 : k , g -> 1점 , h -> 2점
        // 사진을 찍어 얻을 수 있는 최대 점수를 구하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr1 = new int[n];
        char[] arr2 = new char[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.next().charAt(0);
        }

        int max = = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            int n = 0;
            for (int j = i; j < i + k; j++) {
                if (arr2[j] == 'G') {
                    n = 1;
                }
                if (arr2[j] == 'H') {
                    n = 2;
                }
                sum = sum + arr1[j] * n;
            }

            max = Math.max(max, min);
        }

        System.out.println(max);
    }
}