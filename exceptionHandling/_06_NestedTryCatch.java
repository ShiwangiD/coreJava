public class _06_NestedTryCatch {
    public static void main(String[] args){

        // Inner try handle its own exception
        try{
            System.out.println("Outer try starts");
            try{
                System.out.println("Inner try starts");

                System.out.println(5/0);// illegal Arithmetic Exception("/ by zero")

                System.out.println("Inner try ends");
            }
            catch(ArithmeticException e){
                System.out.println("Divide by zero is not allowed : Inner");
            }
            System.out.println("outer try ends");

        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero is not allowed : outer");

        }
    }
    
}
