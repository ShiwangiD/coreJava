// nested static class
public class Nestedclass {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();
        inner.fun();
        inner.fun1(outer);

    }
    
}


// Static nested class
class Outer{
    static private String name = "shikha";
    static int x =5;
    int y;

    static class Inner{  
        void fun(){
            System.out.println("helloooooo  : "+x);
            System.out.println(name);
        }

        void fun1(Outer outer){
            System.out.println(outer.y);
        }

    }

}


class BankAccount {

    private static class InterestCalculator{
       static double calculateYearly(double principal, double rate){
            return principal * rate;
        }
        
    }
    public double computerIntersets(double principal){
        return InterestCalculator.calculateYearly(principal, 0.09);

    }
}






/*
  Nested classes := inside another class.

  why use :=
 1. logically group related classes
 2. improve code readability
 3. increase encapsulation
 4. reduce unnecessary access from outside

 Types :=
 1. static nested class.
 2. Inner class
 3. Local class
 4. Ananymous class 

*/
