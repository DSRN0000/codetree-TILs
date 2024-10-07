import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int n = sc.nextInt();
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            char a = sc.next().charAt(0);
            int num = sc.nextInt();

            int dir;
            if(a == 'E') 
                dir = 0;
            else if (a == 'w')
                dir = 1;
            else if (a == 'S')
                dir = 2;  
            else
                dir = 3;

            x += dx[dir] * num;
            y += dy[dir] * num;
        }

        System.out.print(x + " " + y);
    }
}