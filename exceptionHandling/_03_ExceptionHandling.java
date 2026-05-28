public class _03_ExceptionHandling {
    public static void main(String[] args){
        //exception handling

        System.out.println("Step 1");

        try{
            // risky code 
            int a = 5;
            int b = 0;
            System.out.println(a/b); //illegal ---> new AirthmaticException("/ by zero") 
        }
        catch(ArithmeticException e){
            System.out.println("Division by Zero not allowed :"); // prevent code

        }

        System.out.println("Step 2");

    }
    
}
