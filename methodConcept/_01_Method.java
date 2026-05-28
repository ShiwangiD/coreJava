public class _01_Method {
    static void m1(){
        System.out.println("can not create object and belongs to class");

    }

    void show(){
        System.out.println("No Parameter No return type");
    }
    void rollNo(int rollNo){
        System.out.println("with parameter no return type"+rollNo);
    }

    String getName(){
        System.out.println("No parameter with return type :" );
        return "jannieeee........";
        
    }

    int sum(int a , int b){
        System.out.println("parameter with return type");
        return a+b;

    }
    
    public static void main(String[] args){
        _01_Method m = new _01_Method();
        m.show();
        m.rollNo(19385);
        m.getName();
        m.sum(4, 9);

    }
    
}



/*
 Method := A method in Java is a block of code that used to specific task.
 method Declaration := returnType ---> methodName ---> (parameters).

 types :=
   1. Predefined Methods := Methods already available in Java libraries.
   2. User-defined Methods := Methods created by the programmer.
*/
