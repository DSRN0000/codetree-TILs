public class Main {
    public static void main(String[] args) {
        int a  = 5;
        int b  = 6;
        int c  = 7;

        int tmp;
        tmp  = b;
        int tmp1;
        tmp1  = c;
        b = a;
        c = tmp;
        a = tmp1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}