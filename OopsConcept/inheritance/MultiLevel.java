public class MultiLevel {
    public static void main(String[] args){
      CSEEngineeringStudent cs = new CSEEngineeringStudent();
        cs.attendCseLab();
        cs.markAttendence();
        cs.attendLab();
    }
    
}

class Student{
    String name;
    int rollNo;
   public void markAttendence(){
        System.out.println("mark attedence");
    }

}

class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println("attended Lab");
    }

}

class CSEEngineeringStudent extends EngineeringStudent{
    void attendCseLab(){
        System.out.println("attend CseLab");
    }
}


/*
Multi- Level Inheritance
Student
|
EngineeringStudent
|
CSEEngineeringStudent
*/
