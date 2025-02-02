import java.util.*;
public class Main {
    private static int k, n;
    private static ArrayList<Integer> arr = new ArrayList<>();

    private static void print() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    private static void loop(int number) {
        if (n == number) {
            print();
            return;
        }

        for (int i = 1; i <= k; i++) {
            if (number >= 2 && (i == arr.get(arr.size() - 1)) && i == arr.get(arr.size() - 2)) {
                continue;
            }
            arr.add(i);
            loop(number + 1);
            arr.remove(arr.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        loop(0);
    }
}