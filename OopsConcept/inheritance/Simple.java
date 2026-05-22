// Inheritance : parent and child relationship .
//1. Simple inheritance.
// 2.multi - level inheritance
// 3.hierachical inheritance
// 4.multiple inheritance ---> Not supported in java 

public class Simple {
    public static void main(String[] args){
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendence();
        es.attendLab();

        Student s1 = new Student();
        s1.markAttendence();
    }
    
}

class Student{ // parent
    String name;
    int age;

   public void markAttendence(){
        System.out.println("attendence marked.");
    }
}

class EngineeringStudent extends Student{ // child
    void attendLab(){
        System.out.println("Lap attended");
    }
}

/*
parent (super class)
|
child (sub class) relationship

*/

