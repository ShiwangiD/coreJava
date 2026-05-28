public class Bound{
    public static void main(String[] args){
        Box<Integer> b1 = new Box<>(); 
        b1.value = 5;
        b1.printDouble();

        Box1<Fish> b2 = new Box1<>();
    }
}


// Upper bounds
class Box<T extends Number>{
    T value;

    public void printDouble(){
        System.out.println(value.doubleValue());
    }
}

class Box1<Y extends Animal & Swimmable>{
    Y value;
}

class Animal{
    void display(){
        System.out.println("Displaying Animal");
    }

}
interface Swimmable{
    void swim();
}
class Dog extends Animal{

}

class Fish extends Animal implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Fish is swimming");
    }

}


/*
  Bounds Generics := Bounds restrict what types can be used in generics. ex -> 
   <T extends Number> (Number ---> subclass of Integer, Float and Double not for String and boolean)
   
   Notes := <Y extends class & interface1, Interface2> standard way
*/