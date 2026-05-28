//provide pure abstraction.
// inside the interface  variable (  satatic final ---> by default).
// inside the interface methods (public abstract--->by default)
// constant value ----> usually written in UPPERCASE letters.
// one class implements multiple interfaces but one class extends only one class.

public class Interface {
    public static void main(String[] args){
        Car c1 = new Blackthar();
        c1.drive();
        Payment p = new CreaditCard();
        p.pay();

        Random r1 = new Random();
        r1.fun();

        System.out.println(MathConstant.PI_VALUE);

        C i = new C();
        i.greet1();
        i.greet2();

    }   
}
 interface Car{
    void drive();
}

abstract class Thar implements Car{
    
    abstract public void drive();
}

class Blackthar extends Thar{
    @Override
    public void drive(){
        System.out.println("");

    }
}

// polymorphism 

interface Payment{
    void pay();
}

class CreaditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via creditCard");
    }
}
class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("paying with debitCard");
    }
}

// Variables inside interface

interface MathConstant{
    double PI_VALUE = 3.14;
    int VALUE = 10;

    void fun();
}

class Random implements MathConstant{
    @Override
    public void fun(){
        System.out.println(PI_VALUE);
    }
}

// Supports multiple inheritance by interfaces

interface A{
    void greet1();
}
interface B {
    void greet2();
}
class C implements A,B{
    @Override
    public void greet1(){
    System.out.println("this is first interface");
    }
    @Override
    public void greet2(){
        System.out.println("this is second interface");

    }

}



