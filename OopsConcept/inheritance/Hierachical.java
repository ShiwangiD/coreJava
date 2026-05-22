public class Hierachical {
    public static void main(String[] args){

        EngineeringStudent es = new EngineeringStudent();
        es.attendLab();
        es.markAttendence();

        MedicalStudent ms = new MedicalStudent();
        ms.attendLab();
        ms.markAttendence();

    }
    
}

class Student{ // parent --->A
    String name;
    int age;

   public void markAttendence(){
        System.out.println("attendence marked.");
    }
}

class EngineeringStudent extends Student{ // child ---->B
    void attendLab(){
        System.out.println("Lap attended for engineering student");
    }
}

class MedicalStudent extends Student{ // child ---->C
    void attendLab(){
        System.out.println("Lab attend for medical student");
    }
}


/*
Hierachical inheritance :=
  A  ----> Parent class
  /\
  B C ----> child class
*/
