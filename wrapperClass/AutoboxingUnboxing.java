public class AutoboxingUnboxing {
    public static void main(String[] args){

        // Autoboxing := Java automatically converts a primitive into its wrapper object.

        int x = 10;
        Integer y = x; // autoboxing

        System.out.println(x);
        System.out.println(y); // unboxing


        // Unboxing := Java automatically converts a wrapper object back into a primitive.

     //  Integer a = Integer.valueOf(20);
         Integer a = 20; // autoboxing
         int b = a; // unboxing

         System.out.println(a); //unboxing
         System.out.println(b);

         // On airthmatic Operations

         Integer u=30;
         Integer v=40;

         int sum = u+v;
         System.out.println("sum od u and v"+sum);

         // On methods
         
         int z = 50;
         printInteger(z);
    }
     static void printInteger(Integer z){
        System.out.println(z);
    }   
}


// assignments
// methods
// airthmatic operations
