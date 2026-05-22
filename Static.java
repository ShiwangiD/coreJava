// static keyword :=  belongs to class

public class Static {
    public static void main(String[] args){

        Student s1 = new Student("aditya", 28, 101);
        Student s2 = new Student("somi", 24, 102);

        // Student.collage = "IIT Guwahati";

        System.out.println(s1.name + "," + s1.age + "," +s1.rollNo + "," + Student.collage);
        System.out.println(s2.name + "," + s2.age + "," +s2.rollNo + "," + Student.collage);
    } 
}

class Student{
    String name;
    int age;
    int rollNo;
    static String collage;
    static int grade;

    Student(String name, int age, int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }

    //static block:
    static{
        collage = "IIT Guwahati";
        grade = 8;
    }
}
