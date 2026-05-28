public class _04_ExceptionChainMethod {
    public static void main(String[] args){
        //Exception handling in chain of methods

        System.out.println("Step 1");
    
         try{
             methodA(5, 0); 
        }
        catch(ArithmeticException e){

            // e.printStackTrace();
            System.out.println("Division by zero is not allowed");
        }
        finally{
            // cleanup code(optional)
            //resorces close

            // this always runs
            System.out.println("Heyyyy");
        }
    }

    private static void methodA(int a, int b){
        methodB(a,b);
    }
    private static void methodB(int a, int b){
         System.out.println(a/b);
         System.out.println("Step 2"); // unreachable line 
       
    }
    
}


/* 
Process of program Execution :=
 main() --> push()--> Step 1 --> push() --> methodA() --> push() --> methodB() --> illegal AirthmaticException("/ by zero") -->pop() -->methodB() --> pop() --> methodA() -->divide by zero is not allowed --> pop()--> main() --> Terminate program Execution.
*/


