// Multiple Inheritance := not supported in java . 
public class Multiple {
    public static void main(String[] args){

    }
    
}

class Student{
    String name;
    int rollNo;

    public void markAttendence(){
        System.out.println("marked attendence");
    }
}

class Student2{
    void markAbsence(){
        System.out.println("2 students absent in the class");
    }
}

// class EngineeringStudent extends Student,Student2{ 
//     void attendLab(){
//         System.out.println("attend lap");
//     }
// }


/*
A | B ---> parent class
\   /
  |
 C ---> child class

*/
