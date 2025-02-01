import java.util.*;

public class Main {
    private static int n, m;
    private static ArrayList<Integer> arr = new ArrayList<>();

    private static void print() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void loop(int start, int currNumber) {
        if (currNumber == m) {
            print();
            return;
        }

        for (int i = start; i <= n; i++) {
            arr.add(i);
            loop(i + 1, currNumber + 1);
            arr.remove(arr.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        loop(1, 0);
    }
}
