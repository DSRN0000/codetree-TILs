import java.util.*;
public class Main {
    public static int x, y;

    public static int[] dx = new int[]{1, -1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char a = sc.next().charAt(0);
            int num = sc.nextInt();

            int dir;
            if(a == 'E')
                dir = 0;
            else if (a == 'W')
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