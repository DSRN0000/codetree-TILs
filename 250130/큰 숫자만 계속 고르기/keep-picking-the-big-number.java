import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            pq.add(-number);
        }

        for (int i = 0; i < m; i++) {
            int number = -pq.poll() - 1;
            pq.add(-number);
        }

        System.out.println(-pq.poll());
    }
}