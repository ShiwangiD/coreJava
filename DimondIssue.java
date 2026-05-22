public class DimondIssue {
    public static void main(String[] args){
        D d = new D();
        d.fun();

        R r = new R();
        r.great();

    }
    
}

// Dimond Problem 
/*
  A
  /\
  B C
  \/
  D
*/

interface A{
    void fun();
}

interface B extends A{
   void fun();
}
interface C extends B{
    void fun();
}
class D implements B,C{
    @Override
    public void fun(){
        System.out.println("Dimond problem is slove by interfaces");
    }
}

// Java Resolution priority rule

interface P{
    default void great(){
        System.out.println("Inside P interface");
    }
}
class Q{

    public void great(){
        System.out.println("Inside Q class ");
    }

}
class R extends Q implements P{
    @Override
    public void great(){
        System.out.println("inside R class");
    }

}
