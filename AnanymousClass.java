public class AnanymousClass {
    public static void main(String[] args){
        // Person p1 = new Person();
        // p1.intro();
        // Person p2 = new Guest();
        // p2.intro();

        Person p2 = new Person(){ 
            String name = "Shiwangi";
            // ananymous class
            @Override
            void intro(){
                greet();
                System.out.println(" Hii I am "+name);
            }
            void greet(){
                System.out.println("this method inside ananymous");
            }
        };
        p2.intro();
        
    }
    
}

class Person{
    void intro(){
        System.out.println("Hii I am a Person");
    }
}

class Guest extends Person{
    @Override
    void intro(){
        System.out.println(" Hii  I am Guest");
    }
}


/*
 Ananymous class := 1. a class without name.
 2. used to one time only.
 3. Do not create constructor inside ananymous class, because this class is without name.
 4. Ananymous class ====> lamdas

 Static Nested class
  |
  Inner class
  |
  Ananynous class
  |
  Local Class
*/
