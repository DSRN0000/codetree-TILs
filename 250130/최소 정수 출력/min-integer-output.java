import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            if (pq.isEmpty() && number == 0) {
                pq.add(number);
            }

            if (number != 0) {
                pq.add(number);
            }
            
            if (number == 0) {
                System.out.println(pq.poll());
            }
        }

    }
}