public class _08_UserThrowEx {
    public static void main(String[] args) {
        try{
            checkEligibility(-19);

        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("program is complete");
        }
        
        System.out.println("Step 2");
    }
    private static void checkEligibility(int age){
        if(age <= 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if(age>18){
            System.out.println("you are eligible for vote !");
        }
    }
    
}
