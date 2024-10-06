import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            for (int j = b; j >= a; j--) {
                
                if (i % 2 == 0){
                    System.out.printf("%d * %d = %d", j, i, i*j);
                    
                    if (j != a) {
                        System.out.print(" / ");
                    }
                    if (j == a) {
                        System.out.print("\n");
                    }
                }
            }
        } 
    }
}