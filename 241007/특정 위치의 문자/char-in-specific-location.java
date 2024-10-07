import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char s = sc.next().charAt(0);
        int idx = -1;

        for (int i = 0; i < 6; i++) {
            if (arr[i] == s) 
                idx = i;
                break;
        }

        if (idx == -1)
            System.out.print("None");
        else
             System.out.print(idx);
    }
}