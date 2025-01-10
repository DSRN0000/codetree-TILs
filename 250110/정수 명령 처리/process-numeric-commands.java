import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push")) {
                int num = sc.nextInt();
                stack.push(num);
            }

            if (s.equals("size")) {
                System.out.println(stack.size());
            }
            if (s.equals("empty")) {
                boolean b = stack.isEmpty();
                if (b == true) {
                    System.out.println(1);
                }
                if (b == false) {
                    System.out.println(0);
                }
            }
            if (s.equals("top")) {
                System.out.println(stack.peek());
            }
            if (s.equals("pop")) {
                System.out.println(stack.pop());
            }
        }
    }
}