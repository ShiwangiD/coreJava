public class _06_1_NestedTryCatch {
    public static void main(String[] args){
        // outer catch will handle inner exception

        try{
            System.out.println("Outer try starts");
            try{
                System.out.println("Inner try starts");

                System.out.println(5/0);// illegal ArithmeticException("/ by zero")

                System.out.println("Inner try ends");
            }
            catch(NullPointerException e){
                System.out.println("Null value is not allowed");
            }
            System.out.println("outer try ends");

        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero is not allowed : outer");

        }
    
    }
    
}

// avoid nested try catch
