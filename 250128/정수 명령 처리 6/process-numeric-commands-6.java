import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("push")) {
                int number = sc.nextInt();
                pq.add(-number);
            }

            if (s.equals("pop")) {
                System.out.println(-pq.poll());
            }

            if (s.equals("size")) {
                System.out.println(pq.size());
            }

            if (s.equals("empty")) {
                if (pq.isEmpty()) {
                    System.out.println(1);
                }

                if (!pq.isEmpty()) {
                    System.out.println(0);
                }
            }

            if (s.equals("top")) {
                System.out.println(-pq.peek());
            }
        }
    }
}