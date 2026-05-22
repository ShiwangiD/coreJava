public class StaticPrivateFinal {
    public static void main(String[] args){
        A a = new A();
        a.fun();
    } 
}

class A{
    static void fun(){
        System.out.println("hello");
    }

    private void fun2(){
        System.out.println("Hello");
    }
    final void fun3(){
        System.out.println("hey");
    }
}
class B extends A {
    static void fun(){
        System.out.println("Bye");
    }
    private void fun2(){
        System.out.println("Hiii");
    }

    //  void fun3(){
    //     System.out.println("Bye");
    // }

}
/* 
1.Static method :- do not override value and they belongs to class not a object.
2.Private method := they can not overriden.
3.final keyword:= final method can not be overriden.
4.final ---> class ??? ---> you cannot create child of that class.
5.fields / variable they cannot be polymorphism.



*/ 

