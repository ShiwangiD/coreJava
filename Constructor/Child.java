
class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }
}

public class Child extends Parent {
    Child(){
        // super call immediate parent class object
        super();
        System.out.println("Child constructor");
    }
    public static void main(String[] args){
        Child c = new Child();
    }
    
}
