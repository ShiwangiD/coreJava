// import java.util.ArrayList;
// import java.util.List; 

public class InveriantGenerics {
    public static void main(String[] args){
        // Invariant in generics

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = new ArrayList<>();

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Animal();

        for(Animal animal : animals){
            if(animal == null){
                continue;
            }
            animal.eat();
        }

    }
    
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("walking");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }

}

// covariant array in java but generics is invariant
// wildCard := Used when the type does not matter.(?)
