import java.util.*;
public class Main {
    private static int n;
    private static ArrayList<Integer> arr = new ArrayList<>();
    private static boolean[] visited;

    private static void print() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    private static void loop(int currNumber) {
        if (currNumber == n) {
            print();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i]) {
                continue;
            }
            if (!visited[i]) {
                visited[i] = true;
                arr.add(i);
            }
            loop(currNumber + 1);
            arr.remove(arr.size() - 1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n + 1];

        loop(0);
    }
}