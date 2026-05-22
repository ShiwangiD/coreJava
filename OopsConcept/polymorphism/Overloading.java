// Polymorphism := poly + morphism  = Many + Forms(same methods behave different).
// 1. Compile Time Polymorphism(method Overloading)
// 2. Runtime polymorphism(method overriding))

public class Overloading {
    public static void main(String[] args){
    MathOperations mo = new MathOperations();
    System.out.println(mo.add(3, 5, 6));
    }  
}

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}





/*
  multiple methods with the same name in the same class, but with different parameters (type, number, or order).
*/
