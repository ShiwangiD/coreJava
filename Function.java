public class Function {
    public static void main(String[] args){
        // function in java 
        greet();
        sayHii(" lovely"); // arguement
       int x =  getNumber();
       System.out.println(x);
       System.out.println(multi(3,7 ));

       // function overloading :=
       System.out.println(sum(3, 9));
       System.out.println(sum(2,3,4));
       greet(24, "lovely");
       greet("shiwangi", 24);

       fun1();
       int i = fun2();
       System.out.println(i);
        fun3();
        printNum(5);
    }

    // no i/p  and no o/p :=

    static void greet(){
        System.out.println("hello");
        return; // optional
    }

    // i/p and no o/p :=
    static void sayHii(String name) // no of parameter can be anything
    {
        System.out.println("hello"+name);
    }

    // no i/p and o/p :=

    static int getNumber(){
        return 10;
    }

    // I/p and O/p :=

    static int multi(int a, int b){
        return (a* b);
    }

    static int sum(int a, int b){
        return(a+b);
    }
    static int sum(int a, int b, int c){
        return(a+b+c);
    }
    static void greet(String name, int age){
        System.out.println(name + "and age is"+age);
    }
    static void greet(int age, String name){
        System.out.println("hey your is "+age+ "and name is "+name);
    }
    static int sum(double a, double b){
        return (int)(a+b);
    }
    static void fun1(){
        System.out.println("hellooo");
    }
    static int fun2(){
        System.out.println("heyy!");
        return 5;
    }

    // function chainning:=

    static void fun3(){
        fun4();
        System.out.println("hii");
    }
    static void fun4(){
        fun5();
        System.out.println("helloo");
    }
    static void fun5(){
        System.out.println("hey this is last function");
    }

    // Recursion function := a function which called itself

    static void printNum(int n){
        if(n == 0) // base case used to stop the process
            {
              return;
            } 
        printNum(n-1);
        System.out.println(n);
    }

    
}
