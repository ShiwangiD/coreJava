// Abstraction :=hiding unnecessary implementation details and showing only the essential features of an object.

public class Abstract {
    public static void main(String[] args){
        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();
         Car car1 = new FuelCar();
        car1.start();
        car1.accelerate();
        car1.brake();

    }  
}

abstract class Car{
    void start(){
        System.out.println("car started.");
    }
   abstract void accelerate();     
   abstract void brake();
}
class FuelCar extends Car{
    @Override
    void accelerate(){
      System.out.println("Fuel car is eccelarate.");
    }
    @Override
    void brake(){
        System.out.println("FuelCar is stoping.");
    }
}
class ElectricCar extends Car{
    @Override
    void accelerate(){
        System.out.println(" Electric car is eccelarate.");
    }
    @Override
    void brake(){
        System.out.println("Electric car is stoping.");
    }

}

/*
Abstraction is Achieved Using:=
1.Abstract Classes
2.Interfaces(high level abstraction)

Declared using the abstract keyword:=

1.Abstract methods (no body)
2.Concrete methods (with body)
*/
