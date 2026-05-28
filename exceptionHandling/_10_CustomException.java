public class _10_CustomException {
    public static void main(String[] args){
        try{
            checkEligibility(-19);

        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("program is complete");
        }
        
        System.out.println("Step 2");
    }
    private static void checkEligibility(int age)throws InvalidAgeException{
        if(age <= 0){
            throw new InvalidAgeException("Age cannot be negative");
        }
        if(age>18){
            System.out.println("you are eligible for vote !");
        }

    }
    
}

class  InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
