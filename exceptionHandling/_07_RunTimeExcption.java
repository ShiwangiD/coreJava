public class _07_RunTimeExcption {
    public static void main(String[] args){
        try{
            System.out.println(5/0); // ArithmecticException
            //  String s = null;
            //  s.length();

            // Object obj = "hello";
            // Integer i = (Integer)obj; //  ClassCastException
        }

        catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }

        // catch(ArithmeticException e){
        //     // System.out.println(e.getMessage());
        //      System.out.println("divide by zero is not allowed");
        // }

        // catch(NullPointerException e){
        //       System.out.println("null is not allowed");
        //  }
          catch(Exception e){
              System.out.println("some generic exception");
         }



        // catch(RuntimeException e){
        //      System.out.println("catched by runtime exception");
        // }

        // catch(Exception e){
        //      System.out.println("catched by exception");
        // }

        // catch(Throwable e){ // this is never recommended
        //      System.out.println("catched by throwable exception");
        // }
    }
    
}

// 
