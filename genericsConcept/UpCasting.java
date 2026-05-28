public class UpCasting {
    public static void main(String[] args){

        int x = 10;
        long l =x;
        System.out.println(l); // convert automatic and safe

        // Upcasting
        Dog d = new Dog(); // create child class object
        Animal a = d; // convert parent class refrence
        a.sound(); // calling method
    }
    
}

class Animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println(" dog barks");
    }
}


// Upcasting :- convert child class object into parent class reference, automatic and safe.
// child ----> parent(safe,automatic)
