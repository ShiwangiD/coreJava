public class _02_CallStack {
    public static void main(String[] args){
        int a = 9;
        int b = 0;
        methodA(a,b);
     
    }
     private static void  methodA(int a, int b){
        methodB(a,b);

        }
         private static void  methodB(int a, int b){
            System.out.println(a/b);

        }
    
}


// className.mrthodName(fileName:lineNumber) ---> find exception Syntax
/*
  Sequence of stack trace :- Default exception method
     Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at _02_CallStack.methodB(_02_CallStack.java:13)
	    at _02_CallStack.methodA(_02_CallStack.java:9)
	    at _02_CallStack.main(_02_CallStack.java:5)


*/
