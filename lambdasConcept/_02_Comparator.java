import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _02_Comparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("somi", 101, 90));
        list.add(new Student("suzi", 102, 80));
        list.add(new Student("kim hong", 103, 70));
        list.add(new Student("yonokim", 104, 75));
        list.add(new Student("kim tae", 105, 95));

        Comparator<Student> c1 = new SortByName();
        Comparator<Student> c2 = new SortByMarks();
        Comparator<Student> c3 = new SortByRollno();

        // Collections.sort(list,c1);

        // using ananymous
        // Collections.sort(list, new Comparator<Student>() {
        // @Override
        // public int compare(Student s1 , Student s2){
        // return s1.marks - s2.marks;
        // }

        // });

        // lambda expresion :=
        Collections.sort(list, (s1, s2) -> s1.marks - s2.marks);

        for (Student s : list) {
            System.out.println(s.name + " ," + s.marks + " ," + s.rollNo);
        }

    }

}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class SortByRollno implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollNo - (s2.rollNo);
    }
}

class SortByMarks implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;
    }
}

class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

}

/*
 * Functional interface := only one sigle abstract method and multiple static
 * method .
 * Lambda Expresion : (parameters) -> expression;
 * like (a,b) -> a-b;
 * 
 */
