// Logical Operator := Used to combine multiple conditions.
// Types :(1. And----> && 2. Or----> || 3. not ----> -)

public class LogicalOp {
    public static void main(String[] args){
        int age = 30;

     System.out.println(age > 18 && age < 30); // ====> false
     System.out.println(age > 18 || age < 10);  // ====>true
     System.out.println(!(age > 18));           // ====> false

    }
    
}

/*
  && ----> both condition are true then true
  || ----> one condition is true then true
  _ ------> complement condition is true then false

*/
