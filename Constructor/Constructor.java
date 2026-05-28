public class Constructor {
    public static void main(String[] args){
        Student1 s1 = new Student1("shivi","AKTu",23,10002); 
        s1.markAttendence1();
        
    }
    
}
class Student1{
    String name; // information / data/ characterstics  ----> instance variable
    String collage;
    int age;
    int rollNo;
    Student1(){ // ====> default constructor

    }

      Student1(String name, String collage, int age, int rollNo){// ===> parameterised constructor
            this.name=name;
            this.collage= collage;
            this.age=age;
            this.rollNo=rollNo;
        }

    void markAttendence1(){ // behaviours ---> instance method
        System.out.println("Attendence marked for student "+name + ","+collage+" ,"+age+" ,"+rollNo);
    }
}


/*
 Constructor:= Sepecial types methods used to for initilized object.
 Types :=
   1. Default Constructor := A constructor with no parameters.
   2. Parameterized Constructor := A constructor that accepts parameters.

   Note := when object is created and constructor automatically called.
          constructor always same as class name .


*/
