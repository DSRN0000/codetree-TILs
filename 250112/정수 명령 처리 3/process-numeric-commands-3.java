import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push_front")) {
                int a = sc.nextInt();
                deque.addFirst(a);
            }
            if (s.equals("push_back")) {
                int a = sc.nextInt();
                deque.addLast(a);
            }
            if (s.equals("pop_front")) {
                System.out.println(deque.pollFirst());
            }
            if (s.equals("pop_back")) {
                System.out.println(deque.pollLast());
            }
            if (s.equals("size")) {
                System.out.println(deque.size());
            }
            if (s.equals("empty")) {
                if (deque.isEmpty() == true) {
                    System.out.println(1);
                }
                if (deque.isEmpty() == false) {
                    System.out.println(0);
                }
            }
            if (s.equals("front")) {
                    System.out.println(deque.peekFirst());
            }
            if (s.equals("back")) {
                    System.out.println(deque.peekLast());
            }
        }
    }
}