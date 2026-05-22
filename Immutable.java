public class Immutable {
    public static void main(String[] args){
        Collage collage = new Collage("AKTU", "LUCKNOW");
        Student s1 = new Student(24, "lovely",collage);
        System.out.println(s1.getCollage().name); 
    }
    
}

final class Student{
    private final int age;
    private final String name;
   private final Collage collage;

    Student(int age, String name,Collage collage){
        this.age=age;
        this.name=name;
        this.collage=collage;
    }

    //getters

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public Collage getCollage(){
        return this.collage;
    }
}

class Collage{
    String name;
    String address;
   

    Collage(String name, String address){
        this.name=name;
        this.address=address;
    }

}

/*
 Immutable class := A class whose objects cannot be changed after they are created.

 Rules of Immutable Object :=
 1. Mark my class as final.
 2. Mark my variables as private & final.
 3. No setters.
 4. Initialize fields only through the constructor.
*/
