import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _01_Comparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("somi", 101, 90));
        list.add(new Student("suzi", 102, 80));
        list.add(new Student("kim hong", 103, 70));
        list.add(new Student("yonokim", 104, 75));
        list.add(new Student("kim tae", 105, 95));

        Collections.sort(list);
        for (Student s1 : list) {
            System.out.println(s1.name + " , " + s1.rollNo + " , " + s1.marks);
        }

    }

}

class Student implements Comparable<Student> {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}
