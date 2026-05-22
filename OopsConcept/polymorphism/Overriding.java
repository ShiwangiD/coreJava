public class Overriding {
    public static void main(String[] args){
        Animal a = new Animal();
        a.sound();
        System.out.println("************************");
        Animal a1 = new Dog();
        a1.sound();
        
    }
    
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

/*
 Overriding happens when a child class provides a specific implementation of a method already defined in its parent class.
*/
