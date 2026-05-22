public class Constructor {
    public static void main(String[] args){
        Student1 s1 = new Student1();

        // Default Values
        System.out.println(s1.name);
         System.out.println(s1.collage);
          System.out.println(s1.age);
           System.out.println(s1.rollNo);
    }
    
}
class Student1{
    String name; // information / data/ characterstics  ----> instance variable
    String collage;
    int age;
    int rollNo;

    void markAttendence1(){ // behaviours ---> instance method
        System.out.println("Attendence marked for student "+name);
    }
}
