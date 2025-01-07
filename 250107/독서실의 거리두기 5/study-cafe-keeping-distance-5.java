import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String table = sc.next();
        char[] arr = new char[table.length()];

        for (int i = 0; i < table.length(); i++) {
            arr[i] = table.charAt(i);
        }

        int dis = Integer.MIN_VALUE;
        for (int i = 0; i < table.length(); i++) {

            if (arr[i] == '0') {
                arr[i] = '1';
            }

            else if (arr[i] == '1') {
                continue;
            }

            int min = Integer.MAX_VALUE;
            for (int j = 0; j < table.length() - 1; j++) {
                for (int k = j + 1; k < table.length(); k++) {
                    if (arr[j] == '1' && arr[k] == '1') {
                        min = Math.min(min, (k - j));
                    }
                }
            }
            dis = Math.max(dis, min);
            arr[i] = '0';
        }
        System.out.println(dis);
    }
}