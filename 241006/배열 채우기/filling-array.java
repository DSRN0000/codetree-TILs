import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 0 &&  i != 0) {
                cnt = i;
                break;
            }
        }

        for (int i = cnt - 1; i >= 0; i--){
            System.out.print(num[i] + " ");
        }
    }
}