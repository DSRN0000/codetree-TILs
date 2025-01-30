import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int h, w;

    public Student (String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Student student) {
        return this.h - student.h;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int h = sc.nextInt();
            int w = sc.nextInt();

            student[i] = new Student(name, h, w);
        }
    

    Arrays.sort(student);

    for (int i = 0; i < n; i++) {
        System.out.print(student[i].name + " ");
        System.out.print(student[i].h + " ");
        System.out.println(student[i].w);
    }
    
    }
}