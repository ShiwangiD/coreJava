public class Innerclass {
    public static void main(String[] args){
        Outer outer = new Outer();
        // Outer.Inner inner = new Outer.Inner(); ---> wrong

         Outer.Inner inner = outer.new Inner(); // first type 

        //  Outer.Inner inner = new Outer().new Inner(); // second type
        inner.fun();
        // inner.fun2();
        Outer.Inner.fun2();

    }
    
}

class Outer{
    int x = 10;
    class Inner{
        int x = 20;
        void fun(){
            System.out.println("Hello :"+x);
            System.out.println("Outer x value :"+Outer.this.x);
        }

        static void fun2(){
            System.out.println("Hiiiiiiiiiiiiii");
        }

    }
}


// Inner class := without static keyword called inner class.
// Inner class access to static and non static methods all.
// Inner class link of  Outer class.
// Before java 16 not supported static member
//  in inner class but present time supported

