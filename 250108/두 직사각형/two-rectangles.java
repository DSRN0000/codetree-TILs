import java.util.*;
// 겹치지 않는 경우의 수 찾기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        String s = "nonoverlapping";

        for (int i = 0; i < 4; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = arr1[0]; i <= arr1[2]; i++) {
            for (int j = arr1[1]; j < arr1[3]; j++) {
                for (int k = arr2[0]; k <= arr2[2]; k++) {
                    for (int l = arr2[1]; l <= arr2[3]; l++) {
                        if (i == k && j == l) {
                            s = "overlapping";
                        }
                    }
                }
            }
        }

        System.out.println(s);
    }
}