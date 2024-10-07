import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (max < n)
                max = n;
        }

        System.out.println(max);
    }
}