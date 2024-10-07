import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] countNum = new int[10];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            countNum[num] += 1;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(countNum[i]);
        }
    }
}