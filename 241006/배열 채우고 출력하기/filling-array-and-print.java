import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        for (int j = 0; j < 10; j++) {
            System.out.print(arr[9 - j]);
        }
    }
}