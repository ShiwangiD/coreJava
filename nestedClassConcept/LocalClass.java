public class LocalClass {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.greet();
    } 
}

// Effective final variable := not modify varibles.

class Outer{

    private int e = 9;
    static private int d = 6;
    void greet(){

        int y = 8;
        System.out.println("Hello");

        class Local{
            void sayHello(){
                System.out.println(y);
                System.out.println("hiiiiiiiiiii");
                System.out.println(e);
                System.out.println(d);
            }
        }

        Local local = new Local();
        local.sayHello();
    }
}




//Local Class := A class declared inside a method, constructor, or block,loops.
