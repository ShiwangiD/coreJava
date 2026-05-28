// SuperKeyword := reference of parent object
// ThisKeyword := reference of current object

public class SuperThis {
    public static void main(String[] args){
        EngineeringStudent es = new EngineeringStudent("lovely" ,24,"IIT Guwahati");
        es.print();
    } 
}

class Student{
    String name;
    int rollNo;
    int x = 4;
    Student(){
        System.out.println("Default constructor");
    }

    Student(String name, int rollNo){
        this.name=name;
        this.rollNo= rollNo;

    }

    void print2(){
        System.out.println("super method ");
    }
}

class EngineeringStudent extends Student{
    String collage;
    int x = 5;

    EngineeringStudent( String name, int rollNo,String collage){
        super(name, rollNo);
        this.collage=collage;
    }

    void print(){
    //     super.print2(); // access super method
    //     System.out.println(super.name + ", " + super.rollNo + ", " +super. x); //here super is optional ,access super variable
    //     System.out.println(name + ", " + rollNo + ", " + x);
    System.out.println(collage);
}
}

/*
Super :-
1. To access parent class variable.
2.to access parent class method.
3. Note--> call parent class Constructor.

*/
