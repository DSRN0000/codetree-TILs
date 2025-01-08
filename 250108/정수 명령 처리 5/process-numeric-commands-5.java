import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push_back"))  {
                int num = sc.nextInt();
                arr.add(num);
            }

            if (s.equals("pop_back")) {
                arr.remove(arr.size() - 1);
            }

            if (s.equals("size")) {
                System.out.println(arr.size());
            }

            if (s.equals("get")) { 
                int num = sc.nextInt();
                System.out.println(arr.get(num - 1));
            }
        }
    }
}