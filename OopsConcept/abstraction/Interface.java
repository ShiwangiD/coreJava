// Interface := roles and responsibility , what a class should do, not how to does it.

public class Interface {
    public static void main(String[] args){

        Car car = new ElectricCar();
        car.start();
        car.accelarate();
        car.brake();

        System.out.println("===================================");
        Car car1 = new FuelCar();
        car1.start();
        car1.accelarate();
        car1.brake();
    }   
}

interface Car{
    void start();
    void accelarate();
    void brake();
}

class FuelCar implements Car{

   @Override
   public void start(){
        System.out.println("start the fuel car");
    }

  @Override
  public void accelarate(){
         System.out.println("Fuelcar is eccelerate");
    }

   @Override
   public void brake(){
         System.out.println("stop fuelcar");
    }
}

class ElectricCar implements Car{

   @Override
   public void start(){
         System.out.println("start the Electriccar");
    }

    @Override
    public void accelarate(){
         System.out.println("accelerate the electric car");
    }

   @Override
   public void brake(){
         System.out.println("stop the electric car");
    }
}

/*
1. gives body by child in interface.
2.pure abstraction using by interface(pure what).
3. method defined always public
*/
