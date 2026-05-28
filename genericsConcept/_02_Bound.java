import java.util.ArrayList;
import java.util.List;

// wildCard with upperBound (extends)
public class _02_Bound {
    public static void main(String[] args){
        // List<Dog> dogs = new ArrayList<>();
        // dogs.add(new Dog());
        // dogs.add(new Dog());
        // fun(dogs);

        List<Animal> animal = new ArrayList<>();
        animal.add(new Animal());
        animal.add(new Animal());
        fun(animal);


    }
    static void fun(List<? extends Animal> values){
        for(Animal a : values){
            a.eat();
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

