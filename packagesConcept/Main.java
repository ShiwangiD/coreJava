// import collage.Student;
import collage.*;// all classes of collage package

//import school.Student;

// import packageName.className

public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.print();

        school.Student s2 = new school.Student(); // full package name
        s2.print();

    }
    
}
