import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    if(i == 0)
                        System.out.print("* ");
                    if(i != 0)
                        System.out.print(" ");
                }
                if (j % 2 != 0) {
                    if (i <= j) 
                        System.out.print("* ");
                    
                    if (i > j) 
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}