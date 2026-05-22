public class Enumerator {
    public static void main(String[] args){

        // int status = PaymentStatus.SUCCESS;
        // System.out.println(status);

        // int status2 = 100;

        // if(status == Role.ADMIN){
       // }

       String status = PaymentStatus.FAILED;
       System.out.println(status);
       if(status == "success"){
        
       }

    }
    
}

// Payment status ----> success, failed, pending.
//final 
/*
 problems with this approach:-
 1. type safety.
 2. Poor readability.
 3. No grouping of related entity.
*/

class PaymentStatus{
    // public static final int SUCCESS = 1;
    // public static final int FAILED = 2;
    // public static final int PENDING = 3;

    public static final String SUCCESS = "success";
    public static final String FAILED = "failed";
    public static final String PENDING = "pending";

}
class Role{
    public static final int USER = 1;
    public static final int ADMIN = 2;
    public static final int mANAGER = 2;
}
