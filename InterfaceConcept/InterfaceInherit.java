public class InterfaceInherit {
    public static void main(String[] args){
        // StreetDog sd = new StreetDog();
        // sd.bark();

        Vehicle v = new Car();
        v.drive();

        // Vehicle.breke();

    }
    
}

// Interface inheritance

interface Animal{
    void eat();
}

interface Dog extends Animal{
    void bark();
}
class StreetDog implements Dog{
    @Override
    public void eat(){
        System.out.println("eating");
    }

    @Override
    public void bark(){
        System.out.println("barking");
    }
}

// After java 8 ----> Default Methods, static Methods
// From java 9 -----> Private methods

interface Vehicle{
    default void drive(){
      System.out.println("Vehicle is drive");
      accelerate();
    }
    static void breke(){
        System.out.println("vechile is applying brake");
    }

    private void accelerate(){
        System.out.println("Vehicle is accelerate");
    }
}

class Car implements Vehicle{

    // @Override
    // public void drive(){
    //     System.out.println("Car is driving");
    // }

}
